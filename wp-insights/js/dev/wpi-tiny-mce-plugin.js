(function() {
    tinymce.create('tinymce.plugins.WpInsights', {
        init : function(ed, url) {
            ed.addButton('addWPIPageSection', {
                title : 'Add WPI Page Section Start',
                cmd : 'addWPIPageSection',
                image : url + '/../../assets/eye-20.png'
            });
 
           /* ed.addButton('showrecent', {
                title : 'Add recent posts shortcode',
                cmd : 'showrecent',
                image : url + '/recent.jpg'
            });*/
 
            ed.addCommand('addWPIPageSection', function() {
            	tb_show('Insert WP Insights Page Section', 'admin-ajax.php?action=wpipagesections&postid='+document.getElementById("wpipostid").getAttribute("value"));
                //var shortcode = '[wpi_page_section/]';
                //ed.execCommand('mceInsertContent', 0, shortcode);
            });
 
        },
        // ... Hidden code
    });
    // Register plugin
    tinymce.PluginManager.add( 'WpInsights', tinymce.plugins.WpInsights );
})();