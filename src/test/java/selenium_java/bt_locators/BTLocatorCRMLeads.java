package selenium_java.bt_locators;

public class BTLocatorCRMLeads {
    public static String url = "https://crm.anhtester.com/admin/authentication";
    //locator for login page
    public static String headerLoginPage = "//h1[normalize-space()='Login']";
    public static String inputEmail = "//input[@id='email']";
    public static String inputPassword = "//input[@id='password']";
    public static String buttonLogin = "//button[normalize-space()='Login']";
    public static String checkboxRememberMe = "//input[@id='remember']";
    public static String labelRememberMe = "//label[@for='remember']";
    public static String linkForgetPassword = "//a[normalize-space()='Forgot Password?']";
    public static String alerErrorMessage = "//div[contains(@class,'alert-danger')]";
    public static String alerErrorEmailRequired = "//div[normalize-space()='The Email Address field is required.']";
    public static String alerErrorPasswordRequired = "//div[normalize-space()='The Password field is required.']";
    //locator for Menu
    public static String menuDashboard = "//ul[@id='side-menu']//span[@class='menu-text' and normalize-space()='Dashboard']";
    public static String menuTasks = "//span[@class='menu-text' and normalize-space()='Tasks']";
    public static String menuLeads = "//span[@class='menu-text' and normalize-space()='Leads']";
    //locator for Leads Page
    public static String urlLeads = "https://crm.anhtester.com/admin/leads";
    public static String buttonNewLead = "//a[normalize-space()='New Lead']";
    public static String iconFilterBy = "//div[@id='vueApp']/descendant::button";
    public static String iconLeadSummary = "//a[@data-title='Leads Summary']";
    public static String headerLeadsSummary = "//h4[normalize-space()='Leads Summary']";
    public static String labelActive = "//span[normalize-space()='Active']";
    public static String labelActiveNumber = "//span[normalize-space()='Active']/preceding-sibling::span";
    public static String labelJjjj = "//span[normalize-space()='jjjj']";
    public static String labelJjjjNumber = "//span[normalize-space()='jjjj']/preceding-sibling::span";
    public static String labelCustomer = "//span[normalize-space()='Customer']";
    public static String labelCustomerNumber = "//div[@style='display: block;']/descendant::span[normalize-space()='Customer']/preceding-sibling::span";
    public static String labelLostLeads = "//span[normalize-space()='Lost Leads']";
    public static String labelLostLeadsNumber = "//div[@style='display: block;']/descendant::span[normalize-space()='Lost Leads']/preceding-sibling::span/descendant::span";
    public static String iconLeadKanban = "//a[@data-title='Switch to Kanban']";
    public static String inputSearchLead = "//div[@id='leads_filter']//input[@type='search']";//bắt rộng ra bên ngoài cả icon
    public static String selectLeadLength = "//div[@id='leads_length']//select[@name='leads_length']";
    public static String buttonExport = "//button[normalize-space()='Export']";
    public static String buttonBulkActions = "//button[normalize-space()='Bulk Actions']";
    public static String buttonReload = "//button[@title='Reload']";
    //locator for Leads table
    //header
    public static String rowHead = "//table[@id='leads']//tr[@role='row']";
    public static String inputCheckbox = "//table[@id='leads']//input[@id='mass_select_all']";
    public static String labelSTT = "//table[@id='leads']//th[@id='th-number']";
    public static String labelName = "//table[@id='leads']//th[@id='th-name']";
    public static String labelCompany = "//table[@id='leads']//th[@id='th-company']";
    public static String labelEmail = "//table[@id='leads']//th[@id='th-email']";
    public static String labelPhone = "//table[@id='leads']//th[@id='th-phone']";
    public static String labelValue = "//table[@id='leads']//th[@id='th-lead-value']";
    public static String labelTags = "//table[@id='leads']//th[@id='th-tags']";
    public static String labelAssigned = "//table[@id='leads']//th[@id='th-assigned']";
    public static String labelStatus = "//table[@id='leads']//th[@id='th-status']";
    public static String labelSource = "//table[@id='leads']//th[@id='th-source']";
    public static String labelLastContact = "//table[@id='leads']//th[@id='th-last-contact']";
    public static String labelCreated = "//table[@id='leads']//th[@id='th-date-created']";
    //body 1
    public static String rowBody = "//tr[@id='lead_246']";
    public static String valueRowColume = "//table[@id='leads']//tr[1]//td[3]";
    public static String valueRowColumeSubject = "//table[@id='leads']//tr[1]//td[3]/a[1]";
    public static String iconView = "//table[@id='leads']//tr[1]//td[3]//a[normalize-space()='View']";//dùng hàm để áp dụng cho các bản ghi khác
    public static String iconEdit = "//table[@id='leads']//tr[1]//td[3]//a[normalize-space()='Edit']";
    public static String iconDelete = "//table[@id='leads']//tr[1]//td[3]//a[normalize-space()='Delete']";
    public static String deleteSuccessful = "//span[@class='alert-title']";
    public static String labelRecordCount = "//div[@id='leads_info']";
    public static String buttonPrevious = "//li[@id='leads_previous']//a[normalize-space()='Previous']";
    public static String buttonNumber = "//li[@id='leads_previous']/following-sibling::li/a";
    public static String buttonNext = "//li[@id='leads_next']//a[text()='Next']";
    public static String valueTable = "//table[@id='leads']//td[text()='No matching records found']";
    //locator for Add New Lead
    public static String headAddNewLead = "//h4[normalize-space()='Add new lead']";
    //add status dropdown
    //input sratus dropdown
    public static String dropdownStatus = "//button[@data-id='status']";
    public static String inputSearchStatus = "//button[@data-id='status']/following-sibling::div/descendant::input";
    public static String clickValueStatus = "//a[contains(@id,'bs-select') and normalize-space()='Active']";

    //add source dropdown
    public static String inputSource = "//input[@id='new_source_name']";
    public static String dropdownSource = "//button[@data-id='source']";
    public static String inputSearchSource = "//button[@data-id='source']/following-sibling::div/descendant::input";//bát giá trị bên trong dropdown, dùng hàm để truyền giá trị
    public static String clickValueSource = "//a[contains(@id,'bs-select') and normalize-space()='Google']";
    public static String dropdownAssigned = "//button[@data-id='assigned']";
    public static String inputSearchAssigned = "//button[@data-id='assigned']/following-sibling::div/descendant::input";
    public static String clickValueAssigned = "//a[contains(@id,'bs-select') and normalize-space()='Admin Example']";
    public static String labelTag = "//label[@for='tags']";
    public static String deleteTag = "//div[@id='inputTagsWrapper']//span[@class='text-icon']";
    public static String dropdownTag = "//div[@id='inputTagsWrapper']/ul/li/input";
//    public static String dropdownTag = "//div[@id='inputTagsWrapper']//input[@placeholder='Tag']/ancestor::ul";
    public static String inputTag = "//div[@id='inputTagsWrapper']/ul/li/input";
    public static String clickValueTag = "//div[@id='inputTagsWrapper']//div[normalize-space()='Hapt']";

    //public static String inputTag = "//input[@id='tags']";
    public static String inputName = "//form[@id='lead_form']//input[@id='name']";
    public static String inputPosition = "//form[@id='lead_form']//input[@id='title']";
    public static String inputEmailAddress = "//form[@id='lead_form']//input[@id='email']";
    public static String inputWebsite = "//form[@id='lead_form']//input[@id='website']";
    public static String inputPhone = "//form[@id='lead_form']//input[@id='phonenumber']";
    public static String inputLeadValue = "//form[@id='lead_form']//input[@type='number' and @name='lead_value']";
    public static String inputCompany = "//form[@id='lead_form']//input[@id='company']";
    public static String inputAddress = "//textarea[@id='address']";
    public static String inputCity = "//input[@id='city']";
    public static String inputState = "//input[@id='state']";
    public static String dropdownCountry = "//button[@data-id='country']";
    public static String inputCountry = "//button[@data-id='country']/following-sibling::div/descendant::input";
    public static String clickValueCountry = "//a[normalize-space()='Vietnam']";
    public static String inputZipCode = "//input[@id='zip']";
    public static String dropdownDefaultLanguage = "//button[@data-id='default_language']";
    public static String inputDefaultLanguage = "//button[@data-id='default_language']/following-sibling::div/descendant::input";
    public static String clickValueDefaultLanguage = "//button[@data-id='default_language']/following-sibling::div//a[normalize-space()='Vietnamese']";
    public static String inputDescription = "//textarea[@id='description']";
    public static String checkboxPublic = "//input[@id='lead_public']";
    public static String checkboxContactedToday = "//input[@id='contacted_today']";
    public static String buttonClose = "//form[@id='lead_form']/div[2]/button[normalize-space()='Close']";
    public static String buttonSave = "//form[@id='lead_form']/div[2]/button[normalize-space()='Save']";
    public static String editbuttonSave = "//button[@id='lead-form-submit']";
    //popup thêm mới thành công
    public static String closepopupDetailAddLead = "//div[@id='lead-modal']//button[@class='close']";
}
