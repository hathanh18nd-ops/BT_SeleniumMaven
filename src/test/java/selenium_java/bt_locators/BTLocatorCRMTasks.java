package selenium_java.bt_locators;

public class BTLocatorCRMTasks {
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
    //String menuLeads = "//span[@class='menu-text' and normalize-space()='Leads']";
    //locator for Leads Page
    public static String urlTask = "https://crm.anhtester.com/admin/tasks";
    public static String buttonNewTask = "//a[normalize-space()='New Task']";
    public static String buttonTasksOverview = "//a[normalize-space()='Tasks Overview']";
    public static String iconFilterBy = "//div[@id='vueApp']/descendant::button";
    public static String buttonBackToTasksList = "//a[normalize-space()='Back to tasks list']";
    public static String dropdownStaffMember = "//button[@data-id='member']";
    public static String inputStaffMember = "//button[@data-id='member']/following-sibling::div/descendant::input";
    public static String dropdownMonth = "//button[@data-id='month']";
    public static String inputMonth = "//button[@data-id='month']/following-sibling::div/descendant::input";
    public static String dropdownStatus = "//button[@data-id='status']";
    public static String dropdownYear = "//button[@data-id='year']";
    public static String buttonFilter = "//button[text()='Filter']";
    //Tasks Summary
    public static String headerTasksSummary = "//h4[normalize-space()='Tasks Summary']";
    public static String labelNotStarted = "//span[normalize-space()='Not Started']";
    public static String labelNotStartedNumber = "//span[normalize-space()='Not Started']/preceding-sibling::span";
    public static String labelNotStartedTasksAssigned = "//span[normalize-space()='Not Started']/parent::div/following-sibling::p";
    public static String labelInProgress = "//span[normalize-space()='In Progress']";
    public static String labelInProgressNumber = "//span[normalize-space()='In Progress']/preceding-sibling::span";
    public static String labelInProgressTasksAssigned = "//span[normalize-space()='In Progress']/parent::div/following-sibling::p";
    public static String labelTesting = "//span[normalize-space()='Testing']";
    public static String labelTestingNumber = "//span[normalize-space()='Testing']/preceding-sibling::span";
    public static String labelTestingTasksAssigned = "//span[normalize-space()='Testing']/parent::div/following-sibling::p";
    public static String labelAwaitingFeedback = "//span[normalize-space()='Awaiting Feedback']";
    public static String labelAwaitingFeedbackNumber = "//span[normalize-space()='Awaiting Feedback']/preceding-sibling::span";
    public static String labelAwaitingFeedbackTasksAssigned = "//span[normalize-space()='Awaiting Feedback']/parent::div/following-sibling::p";
    public static String labelComplete = "//span[normalize-space()='Complete']";
    public static String labelCompleteNumber = "//span[normalize-space()='Complete']/preceding-sibling::span";
    public static String labelCompleteTasksAssigned = "//span[normalize-space()='Complete']/parent::div/following-sibling::p";
    public static String inputSearchTask = "//div[@id='tasks_filter']//input[@type='search']";
    public static String inputTaskLength = "//div[@id='tasks_length']//select[@name='tasks_length']";
    public static String buttonExport = "//button[normalize-space()='Export']";
    public static String buttonBulkActions = "//button[normalize-space()='Bulk Actions']";
    public static String buttonReload = "//button[@title='Reload']";
    //locator for Tasks table
    //header
    public static String rowHead = "//tr[@role='row']";
    public static String inputCheckbox = "//input[@id='mass_select_all']";
    public static String labelSTT = "//th[text()='#']";
    public static String labelName = "//th[text()='Name']";
    public static String labelStatus = "//th[text()='Status']";
    public static String labelStartDate = "//th[text()='Start Date']";
    public static String labelDueDate = "//th[text()='Due Date']";
    public static String labelAssignedTo = "//th[text()='Assigned to']";
    public static String labelTags = "//th[text()='Tags']";
    public static String labelPriority = "//th[text()='Priority']";
    //body
    public static String rowBody = "//table[@id='tasks']//tbody/child::tr[1]";
    public static String rowColumnName = "//table[@id='tasks']//tr[1]/td[3]";
    public static String rowColumnNameSubject = "//table[@id='tasks']//tr[1]/td[3]/a[1]";
    public static String iconStartTimer = "//table[@id='tasks']//tbody/child::tr[1]/child::td[3]//a[normalize-space()='Start Timer']";
    public static String iconEdit = "//table[@id='tasks']//tr[1]/td[3]//a[normalize-space()='Edit']";
    public static String iconDelete = "//table[@id='tasks']//tr[1]/td[3]//a[normalize-space()='Delete']";
    public static String deleteSuccessful = "//span[@class='alert-title']";
    public static String labelRecordCount = "//div[@id='tasks_info']";
    public static String buttonPrevious = "//li[@id='tasks_previous']/a[normalize-space()='Previous']";
    public static String buttonNumber = "//li[@id='tasks_previous']/following-sibling::li/a";
    public static String buttonNext = "//li[@id='tasks_next']//a[text()='Next']";
    public static String selectNumberPage = "//select[@id='dt-page-jump-tasks']";
    public static String valueTable = "//table[@id='tasks']//td[text()='No matching records found']";
    //locator for Add New Task
    public static String headAddNewTask = "//h4[normalize-space()='Add new task']";
    public static String checkboxPublic = "//input[@id='task_is_public']";
    public static String checkboxBillable = "//input[@id='task_is_billable']";
    public static String buttonAttachFiles = "//a[normalize-space()='Attach Files']";
    public static String inputSubject = "//input[@id='name']";
    public static String inputHourlyRate = "//input[@id='hourly_rate']";
    public static String inputStartDate = "//input[@id='startdate']";
    public static String inputDueDate = "//input[@id='duedate']";
    public static String iconDueDate = "//input[@id='duedate']/following-sibling::div";
//    public static String valueDueDate = "//input[@id='duedate']/following-sibling::div";
    public static String labelCBBPriority = "//label[@for='priority' and normalize-space()='Priority']";
    public static String comboboxPriority = "//button[@data-id='priority']";
    public static String clickValuePriority = "//button[@data-id='priority']/following-sibling::div//span[normalize-space()='High']/parent::a";
    public static String comboboxRepeatEvery = "//button[@data-id='repeat_every']";
    public static String clickValueRepeatEvery = "//button[@data-id='repeat_every']/following-sibling::div//span[normalize-space()='1 Month']/parent::a";
    public static String comboboxRelatedTo = "//button[@data-id='rel_type']";
    public static String clickValueRelatedTo = "//button[@data-id='rel_type']/following-sibling::div//span[normalize-space()='Customer']/parent::a";
    //sau khi chọn Related To là Customer
    public static String comboboxRelatedToCustomer = "//button[@data-id='rel_id']";
    public static String inputRelatedToCustomer = "//button[@data-id='rel_id']/following-sibling::div/descendant::input";
    //public static String inputRelatedToCustomer = "//button[@data-id='rel_id']/following-sibling::div//input";
    public static String clickValueRelatedToCustomer = "//button[@data-id='rel_id']/following-sibling::div/descendant::span[text()='PNJ']";
    public static String comboboxAssignees = "//button[@data-id='assignees']";
    public static String clickValueAssignees = "//button[@data-id='assignees']/following-sibling::div//span[normalize-space()='Admin Anh Tester']/parent::a";
    public static String inputAssignees = "//button[@data-id='assignees']/following-sibling::div/descendant::input";
    public static String comboboxFollowers = "//button[@data-id='followers[]']";
    public static String clickValueFollowers = "//button[@data-id='followers[]']/following-sibling::div//span[normalize-space()='Admin Anh Tester']/parent::a";
    public static String inputFollowers = "//button[@data-id='followers[]']/following-sibling::div/descendant::input";
    public static String inputTags = "//label[@for='tags']/following-sibling::ul/descendant::input";
    public static String dropdownTag = "//div[@id='inputTagsWrapper']/ul/li/input";
    public static String deleteTag = "//div[@id='inputTagsWrapper']//span[@class='text-icon']";
    public static String clickValueTag = "//div[@id='inputTagsWrapper']//div[normalize-space()='Hapt']";
    public static String labelTag = "//label[@for='tags']";
    public static String valueTags = "//label[@for='tags']/following-sibling::ul/descendant::input//div[normalize-space()='Hapt']";
    //String multichoiceTags = "//input[@id='tags']/following-sibling::ul/descendant::input";
    public static String textareaDescription = "//textarea[@id='description']";
    public static String iframeDescription = "//iframe[@id='description_ifr']";
    public static String inputTaskDescription = "//body[@data-id='description']/p";
    public static String buttonClose = "//form[@id='task-form']//button[normalize-space()='Close']";
    public static String buttonSave = "//form[@id='task-form']//button[normalize-space()='Save']";
    public static String headerEditTask = "//h4[contains(normalize-space(),'Edit task')]";
    //popup thêm mới thành công
    public static String closepopupDetailAddTask = "//div[@id='task-modal']//button[@class='close']";
}
