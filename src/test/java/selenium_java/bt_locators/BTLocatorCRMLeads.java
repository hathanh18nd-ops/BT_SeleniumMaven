package selenium_java.bt_locators;

public class BTLocatorCRMLeads {
    String url = "https://crm.anhtester.com/admin/authentication";
    //locator for login page
    String headerLoginPage = "//h1[normalize-space()='Login']";
    String inputEmail = "//input[@id='email']";
    String inputPassword = "//input[@id='password']";
    String buttonLogin = "//button[normalize-space()='Login']";
    String checkboxRememberMe = "//input[@id='remember']";
    String labelRememberMe = "//label[@for='remember']";
    String linkForgetPassword = "//a[normalize-space()='Forgot Password?']";
    String alerErrorMessage = "//div[contains(@class,'alert-danger')]";
    String alerErrorEmailRequired = "//div[normalize-space()='The Email Address field is required.']";
    String alerErrorPasswordRequired = "//div[normalize-space()='The Password field is required.']";
    //locator for Menu
    String menuTasks = "//span[@class='menu-text' and normalize-space()='Tasks']";
    String menuLeads = "//span[@class='menu-text' and normalize-space()='Leads']";
    //locator for Leads Page
    String urlLeads = "https://crm.anhtester.com/admin/leads";
    String buttonNewLead = "//a[normalize-space()='New Lead']";
    String buttonFilter = "//div[@id='vueApp']/descendant::button";
    String iconLeadSummary = "//a[@data-title='Leads Summary']";
    String headerLeadsSummary = "//h4[normalize-space()='Leads Summary']";
    String labelActive = "//span[normalize-space()='Active']";
    String labelActiveNumber = "//span[normalize-space()='Active']/preceding-sibling::span";
    String labelJjjj = "//span[normalize-space()='jjjj']";
    String labelJjjjNumber = "//span[normalize-space()='jjjj']/preceding-sibling::span";
    String labelCustomer = "//span[normalize-space()='Customer']";
    String labelCustomerNumber = "//div[@style='display: block;']/descendant::span[normalize-space()='Customer']/preceding-sibling::span";
    String labelLostLeads = "//span[normalize-space()='Lost Leads']";
    String labelLostLeadsNumber = "//div[@style='display: block;']/descendant::span[normalize-space()='Lost Leads']/preceding-sibling::span/descendant::span";
    String iconLeadKanban = "//a[@data-title='Switch to Kanban']";
    String inputSearchLead = "//div[@id='leads_filter']//input[@type='search']";//bắt rộng ra bên ngoài cả icon
    String selectLeadLength = "//div[@id='leads_length']//select[@name='leads_length']";
    String buttonExport = "//button[normalize-space()='Export']";
    String buttonBulkActions = "//button[normalize-space()='Bulk Actions']";
    String buttonReload = "//button[@title='Reload']";
    //locator for Leads table
    //header
    String rowHead = "//tr[@role='row']";
    String inputCheckbox = "//input[@id='mass_select_all']";
    String labelSTT = "//th[@id='th-number']";//bắt thêm cả thông tin của bảng để tránh trùng tên với bảng khác
    String labelName = "//th[@id='th-name']";
    String labelCompany = "//th[@id='th-company']";
    String labelEmail = "//th[@id='th-email']";
    String labelPhone = "//th[@id='th-phone']";
    String labelValue = "//th[@id='th-lead-value']";
    String labelTags = "//th[@id='th-tags']";
    String labelAssigned = "//th[@id='th-assigned']";
    String labelStatus = "//th[@id='th-status']";
    String labelSource = "//th[@id='th-source']";
    String labelLastContact = "//th[@id='th-last-contact']";
    String labelCreated = "//th[@id='th-date-created']";
    //body 1
    String rowBody = "//tr[@id='lead_246']";
    String iconView = "//tr[@id='lead_246']//a[normalize-space()='View']";//dùng hàm để áp dụng cho các bản ghi khác
    String iconEdit = "//tr[@id='lead_246']//a[normalize-space()='Edit']";
    String iconDelete = "//tr[@id='lead_246']//a[normalize-space()='Delete']";
    String labelRecordCount = "//div[@id='leads_info']";
    String buttonPrevious = "//li[@id='leads_previous']//a[normalize-space()='Previous']";
    String buttonNumber = "//div[@id='leads_paginate']/ul/li[2]/a";
    String buttonNext = "//li[@id='leads_next']//a[text()='Next']";
    //locator for Add New Lead
    String headAddNewLead = "//h4[normalize-space()='Add new lead']";
    String dropdownStatus = "//input[@id='new_status_name']";
    String inputSearchStatus = "//button[@data-id='status']/following-sibling::div/descendant::input";
    String dropdownSource = "//input[@id='new_source_name']";
    String inputSearchSource = "//button[@data-id='source']/following-sibling::div/descendant::input";//bát giá trị bên trong dropdown, dùng hàm để truyền giá trị
    String inputSearchAssigned = "//button[@data-id='assigned']/following-sibling::div/descendant::input";
    String labelTag = "//label[@for='tags']";
    String inputTag = "//input[@id='tags']";
    String inputName = "//form[@id='lead_form']//input[@id='name']";
    String inputPosition = "//form[@id='lead_form']//input[@id='title']";
    String inputEmailAddress = "//form[@id='lead_form']//input[@id='email']";
    String inputWebsite = "//form[@id='lead_form']//input[@id='website']";
    String inputPhone = "//form[@id='lead_form']//input[@id='phonenumber']";
    String inputLeadValue = "//form[@id='lead_form']//input[@type='number' and @name='lead_value']";
    String inputCompany = "//form[@id='lead_form']//input[@id='company']";
    String inputAddress = "//textarea[@id='address']";
    String inputCity = "//input[@id='city']";
    String inputState = "//input[@id='state']";
    String inputCountry = "//button[@data-id='country']/following-sibling::div/descendant::input";
    String inputZipCode = "//input[@id='zip']";
    String inputDefaultLanguage = "//button[@data-id='default_language']/following-sibling::div/descendant::input";
    String inputDescription = "//textarea[@id='description']";
    String checkboxPublic = "//input[@id='lead_public']";
    String checkboxContactedToday = "//input[@id='contacted_today']";
    String buttonClose = "//form[@id='lead_form']/div[2]/button[normalize-space()='Close']";
    String buttonSave = "//form[@id='lead_form']/div[2]/button[normalize-space()='Save']";
}
