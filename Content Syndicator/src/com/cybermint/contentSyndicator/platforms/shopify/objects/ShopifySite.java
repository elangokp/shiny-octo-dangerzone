package com.cybermint.contentSyndicator.platforms.shopify.objects;

public class ShopifySite {

	private Integer crawlHeaderID;
	private Integer siteID;
	private String storeURL;
	private ShopifyResponse futureResponse;
	private String html;
	private String responseCode;
	private String responseText;
	private String exceptionName;
	
	private int dnsResolutionStatus;
	private String canonicalHostName;
	private String hostAddress;
	
	private int lastSuccessfulPage;
	private int lastSuccessfulProduct;
	
	private int techDeterminationStatus;	
	private boolean useTrackify;
	private boolean usePixelPerfect;
	private boolean useHextomShippingBar;
	private boolean useKlaviyo;
	private boolean useWheelio;
	private boolean useTrust;
	private boolean useTrustHero;
	private boolean useCartHook;
	private boolean useCriteo;
	private boolean useHurrify;
	private boolean useBestCurrencyConverter;
	private boolean useFomo;
	private boolean useBeeketing;
	private boolean useHextomMCC;
	private boolean useRetargetApp;
	private boolean usePersonalizerLimespot;
	private boolean useCoin;
	private boolean useRecart;
	private boolean useCartBack;
	private boolean useOneClickUpsell;
	private boolean useZipifyPages;
	private boolean useAdroll;
	private boolean useQuantityBreaks;
	private boolean useSimplifiProgrammatic;
	private boolean useCurrencyConverterPlus;
	private boolean useHextomQuickAnnouncement;
	private boolean useLastSecondCoupon;
	private boolean useExpressReviews;
	private boolean useAliReviews;
	private boolean useWeglot;
	private boolean useLooxReviews;
	private boolean useSmar7BundleUpsell;
	private boolean useAutoCurrencySwitcher;
	private boolean useSmar7CountdownTimer;
	private boolean useFrequentlyBoughtTogether;
	private boolean useAlsoBought;
	private boolean useBoldUpsell;
	private boolean useBoldBrain;
	private boolean useBoldMultiCurrency;
	private boolean useBoldSalesMotivator;
	private boolean useBoldProductBundles;
	private boolean useShopifyProductReviews;
	private boolean useBoosterDiscountedUpsells;
	private boolean useBoosterBundleUpsell;
	private boolean useInCartUpsell;
	
	public static final int STATUS_COMPLETED = 0; 
	public static final int STATUS_INPROGRESS = -1; 
	public static final int STATUS_PENDING = 1; 
	
	public Integer getCrawlHeaderID() {
		return crawlHeaderID;
	}
	public void setCrawlHeaderID(Integer crawlHeaderID) {
		this.crawlHeaderID = crawlHeaderID;
	}
	public Integer getSiteID() {
		return siteID;
	}
	public void setSiteID(Integer siteID) {
		this.siteID = siteID;
	}
	public String getStoreURL() {
		return storeURL;
	}
	public void setStoreURL(String storeURL) {
		this.storeURL = storeURL;
	}
	public ShopifyResponse getFutureResponse() {
		return futureResponse;
	}
	public void setFutureResponse(ShopifyResponse futureResponse) {
		this.futureResponse = futureResponse;
	}
	public int getTechDeterminationStatus() {
		return techDeterminationStatus;
	}
	public void setTechDeterminationStatus(int techDeterminationStatus) {
		this.techDeterminationStatus = techDeterminationStatus;
	}
	public boolean isUseTrackify() {
		return useTrackify;
	}
	public void setUseTrackify(boolean useTrackify) {
		this.useTrackify = useTrackify;
	}
	public boolean isUsePixelPerfect() {
		return usePixelPerfect;
	}
	public void setUsePixelPerfect(boolean usePixelPerfect) {
		this.usePixelPerfect = usePixelPerfect;
	}
	public boolean isUseHextomShippingBar() {
		return useHextomShippingBar;
	}
	public void setUseHextomShippingBar(boolean useHextomShippingBar) {
		this.useHextomShippingBar = useHextomShippingBar;
	}
	public boolean isUseKlaviyo() {
		return useKlaviyo;
	}
	public void setUseKlaviyo(boolean useKlaviyo) {
		this.useKlaviyo = useKlaviyo;
	}
	public boolean isUseWheelio() {
		return useWheelio;
	}
	public void setUseWheelio(boolean useWheelio) {
		this.useWheelio = useWheelio;
	}
	public boolean isUseTrust() {
		return useTrust;
	}
	public void setUseTrust(boolean useTrust) {
		this.useTrust = useTrust;
	}
	public boolean isUseCartHook() {
		return useCartHook;
	}
	public void setUseCartHook(boolean useCartHook) {
		this.useCartHook = useCartHook;
	}
	public boolean isUseCriteo() {
		return useCriteo;
	}
	public void setUseCriteo(boolean useCriteo) {
		this.useCriteo = useCriteo;
	}
	public boolean isUseHurrify() {
		return useHurrify;
	}
	public void setUseHurrify(boolean useHurrify) {
		this.useHurrify = useHurrify;
	}
	public boolean isUseBestCurrencyConverter() {
		return useBestCurrencyConverter;
	}
	public void setUseBestCurrencyConverter(boolean useBestCurrencyConverter) {
		this.useBestCurrencyConverter = useBestCurrencyConverter;
	}
	public boolean isUseFomo() {
		return useFomo;
	}
	public void setUseFomo(boolean useFomo) {
		this.useFomo = useFomo;
	}
	public boolean isUseBeeketing() {
		return useBeeketing;
	}
	public void setUseBeeketing(boolean useBeeketing) {
		this.useBeeketing = useBeeketing;
	}
	public boolean isUseHextomMCC() {
		return useHextomMCC;
	}
	public void setUseHextomMCC(boolean useHextomMCC) {
		this.useHextomMCC = useHextomMCC;
	}
	public boolean isUseRetargetApp() {
		return useRetargetApp;
	}
	public void setUseRetargetApp(boolean useRetargetApp) {
		this.useRetargetApp = useRetargetApp;
	}
	public boolean isUsePersonalizerLimespot() {
		return usePersonalizerLimespot;
	}
	public void setUsePersonalizerLimespot(boolean usePersonalizerLimespot) {
		this.usePersonalizerLimespot = usePersonalizerLimespot;
	}
	public boolean isUseCoin() {
		return useCoin;
	}
	public void setUseCoin(boolean useCoin) {
		this.useCoin = useCoin;
	}
	public boolean isUseRecart() {
		return useRecart;
	}
	public void setUseRecart(boolean useRecart) {
		this.useRecart = useRecart;
	}
	public boolean isUseOneClickUpsell() {
		return useOneClickUpsell;
	}
	public void setUseOneClickUpsell(boolean useOneClickUpsell) {
		this.useOneClickUpsell = useOneClickUpsell;
	}
	public boolean isUseZipifyPages() {
		return useZipifyPages;
	}
	public void setUseZipifyPages(boolean useZipifyPages) {
		this.useZipifyPages = useZipifyPages;
	}
	public boolean isUseAdroll() {
		return useAdroll;
	}
	public void setUseAdroll(boolean useAdroll) {
		this.useAdroll = useAdroll;
	}
	public boolean isUseQuantityBreaks() {
		return useQuantityBreaks;
	}
	public void setUseQuantityBreaks(boolean useQuantityBreaks) {
		this.useQuantityBreaks = useQuantityBreaks;
	}
	public boolean isUseSimplifiProgrammatic() {
		return useSimplifiProgrammatic;
	}
	public void setUseSimplifiProgrammatic(boolean useSimplifiProgrammatic) {
		this.useSimplifiProgrammatic = useSimplifiProgrammatic;
	}
	public boolean isUseCurrencyConverterPlus() {
		return useCurrencyConverterPlus;
	}
	public void setUseCurrencyConverterPlus(boolean useCurrencyConverterPlus) {
		this.useCurrencyConverterPlus = useCurrencyConverterPlus;
	}
	public boolean isUseHextomQuickAnnouncement() {
		return useHextomQuickAnnouncement;
	}
	public void setUseHextomQuickAnnouncement(boolean useHextomQuickAnnouncement) {
		this.useHextomQuickAnnouncement = useHextomQuickAnnouncement;
	}
	public boolean isUseLastSecondCoupon() {
		return useLastSecondCoupon;
	}
	public void setUseLastSecondCoupon(boolean useLastSecondCoupon) {
		this.useLastSecondCoupon = useLastSecondCoupon;
	}
	public boolean isUseTrustHero() {
		return useTrustHero;
	}
	public void setUseTrustHero(boolean useTrustHero) {
		this.useTrustHero = useTrustHero;
	}
	public boolean isUseExpressReviews() {
		return useExpressReviews;
	}
	public void setUseExpressReviews(boolean useExpressReviews) {
		this.useExpressReviews = useExpressReviews;
	}
	public boolean isUseAliReviews() {
		return useAliReviews;
	}
	public void setUseAliReviews(boolean useAliReviews) {
		this.useAliReviews = useAliReviews;
	}
	public boolean isUseWeglot() {
		return useWeglot;
	}
	public void setUseWeglot(boolean useWeglot) {
		this.useWeglot = useWeglot;
	}
	public boolean isUseLooxReviews() {
		return useLooxReviews;
	}
	public void setUseLooxReviews(boolean useLooxReviews) {
		this.useLooxReviews = useLooxReviews;
	}
	public boolean isUseSmar7BundleUpsell() {
		return useSmar7BundleUpsell;
	}
	public void setUseSmar7BundleUpsell(boolean useSmar7BundleUpsell) {
		this.useSmar7BundleUpsell = useSmar7BundleUpsell;
	}
	public boolean isUseAutoCurrencySwitcher() {
		return useAutoCurrencySwitcher;
	}
	public void setUseAutoCurrencySwitcher(boolean useAutoCurrencySwitcher) {
		this.useAutoCurrencySwitcher = useAutoCurrencySwitcher;
	}
	public boolean isUseSmar7CountdownTimer() {
		return useSmar7CountdownTimer;
	}
	public void setUseSmar7CountdownTimer(boolean useSmar7CountdownTimer) {
		this.useSmar7CountdownTimer = useSmar7CountdownTimer;
	}
	public boolean isUseFrequentlyBoughtTogether() {
		return useFrequentlyBoughtTogether;
	}
	public void setUseFrequentlyBoughtTogether(boolean useFrequentlyBoughtTogether) {
		this.useFrequentlyBoughtTogether = useFrequentlyBoughtTogether;
	}
	public boolean isUseAlsoBought() {
		return useAlsoBought;
	}
	public void setUseAlsoBought(boolean useAlsoBought) {
		this.useAlsoBought = useAlsoBought;
	}
	public boolean isUseBoldUpsell() {
		return useBoldUpsell;
	}
	public void setUseBoldUpsell(boolean useBoldUpsell) {
		this.useBoldUpsell = useBoldUpsell;
	}
	public boolean isUseBoldBrain() {
		return useBoldBrain;
	}
	public void setUseBoldBrain(boolean useBoldBrain) {
		this.useBoldBrain = useBoldBrain;
	}
	public boolean isUseBoldMultiCurrency() {
		return useBoldMultiCurrency;
	}
	public void setUseBoldMultiCurrency(boolean useBoldMultiCurrency) {
		this.useBoldMultiCurrency = useBoldMultiCurrency;
	}
	public boolean isUseBoldSalesMotivator() {
		return useBoldSalesMotivator;
	}
	public void setUseBoldSalesMotivator(boolean useBoldSalesMotivator) {
		this.useBoldSalesMotivator = useBoldSalesMotivator;
	}
	public boolean isUseBoldProductBundles() {
		return useBoldProductBundles;
	}
	public void setUseBoldProductBundles(boolean useBoldProductBundles) {
		this.useBoldProductBundles = useBoldProductBundles;
	}
	public boolean isUseShopifyProductReviews() {
		return useShopifyProductReviews;
	}
	public void setUseShopifyProductReviews(boolean useShopifyProductReviews) {
		this.useShopifyProductReviews = useShopifyProductReviews;
	}
	public boolean isUseBoosterDiscountedUpsells() {
		return useBoosterDiscountedUpsells;
	}
	public void setUseBoosterDiscountedUpsells(boolean useBoosterDiscountedUpsells) {
		this.useBoosterDiscountedUpsells = useBoosterDiscountedUpsells;
	}
	public boolean isUseBoosterBundleUpsell() {
		return useBoosterBundleUpsell;
	}
	public void setUseBoosterBundleUpsell(boolean useBoosterBundleUpsell) {
		this.useBoosterBundleUpsell = useBoosterBundleUpsell;
	}
	public String getHtml() {
		return html;
	}
	public void setHtml(String html) {
		this.html = html;
	}
	public boolean isUseInCartUpsell() {
		return useInCartUpsell;
	}
	public void setUseInCartUpsell(boolean useInCartUpsell) {
		this.useInCartUpsell = useInCartUpsell;
	}
	public boolean isUseCartBack() {
		return useCartBack;
	}
	public void setUseCartBack(boolean useCartBack) {
		this.useCartBack = useCartBack;
	}
	public String getResponseCode() {
		return responseCode;
	}
	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}
	public String getExceptionName() {
		return exceptionName;
	}
	public void setExceptionName(String exceptionName) {
		this.exceptionName = exceptionName;
	}
	public String getResponseText() {
		return responseText;
	}
	public void setResponseText(String responseText) {
		this.responseText = responseText;
	}
	public int getDnsResolutionStatus() {
		return dnsResolutionStatus;
	}
	public void setDnsResolutionStatus(int dnsResolutionStatus) {
		this.dnsResolutionStatus = dnsResolutionStatus;
	}
	public String getCanonicalHostName() {
		return canonicalHostName;
	}
	public void setCanonicalHostName(String canonicalHostName) {
		this.canonicalHostName = canonicalHostName;
	}
	public String getHostAddress() {
		return hostAddress;
	}
	public void setHostAddress(String hostAddress) {
		this.hostAddress = hostAddress;
	}
	public int getLastSuccessfulPage() {
		return lastSuccessfulPage;
	}
	public void setLastSuccessfulPage(int lastSuccessfulPage) {
		this.lastSuccessfulPage = lastSuccessfulPage;
	}
	public int getLastSuccessfulProduct() {
		return lastSuccessfulProduct;
	}
	public void setLastSuccessfulProduct(int lastSuccessfulProduct) {
		this.lastSuccessfulProduct = lastSuccessfulProduct;
	}
	
	
}
