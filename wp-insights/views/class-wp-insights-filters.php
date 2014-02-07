<?php

class WP_Insights_Filters {
	
	public $fromDate;
	public $tillDate;
	
	function __construct() {
		
		if(!empty($_REQUEST['fromDate'])){
			$_SESSION['fromDate'] = $_REQUEST['fromDate'];
		}
		
		if(!empty($_REQUEST['tillDate'])){
			$_SESSION['tillDate'] = $_REQUEST['tillDate'];
		}
		
		if(!empty($_SESSION['fromDate']) && !empty($_SESSION['tillDate'])) {
			error_log("From Date and Till Date is present ");
			$this->fromDate = $_SESSION['fromDate'];
			$this->tillDate = $_SESSION['tillDate'];
		}else if(empty($_SESSION['fromDate']) && !empty($_SESSION['tillDate'])) {
			error_log("From Date is empty ");
			$this->fromDate = $_SESSION['tillDate'];
			$this->tillDate = $_SESSION['tillDate'];
		}else if(!empty($_SESSION['fromDate']) && empty($_SESSION['tillDate'])) {
			error_log("Till Date is empty ");
			$this->fromDate = $_SESSION['fromDate'];
			$this->tillDate = $_SESSION['fromDate'];
		}else if(empty($_SESSION['fromDate']) && empty($_SESSION['tillDate'])) {
			error_log("From Date and Till Date are empty ");
			$this->tillDate = date("Y-m-d");
			$oneMonthBack = mktime(0,0,0,date("m")-1,date("d"), date("Y"));
			$this->fromDate = date("Y-m-d",$oneMonthBack);
		}
		
		$_SESSION['fromDate'] = $this->fromDate;
		$_SESSION['tillDate'] = $this->tillDate;
	}
	
	function display() {
		?>
		<label for="fromDate">From:</label> 
		<input id="fromDate" type="text" name="fromDate" value="<?php echo $this->fromDate?>" /> 
		<label for="tillDate">Till:</label> 
		<input id="tillDate" type="text" name="tillDate" value="<?php echo $this->tillDate?>" /> 
		<?php
		submit_button( 'Filter', 'button', false, false, array('id' => 'searchSubmit') );
	}
}