package selenium_java.bt_locators;

public class BTLocatorCRMTasks {
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
    //String menuLeads = "//span[@class='menu-text' and normalize-space()='Leads']";
    //locator for Leads Page
    String urlTask = "https://crm.anhtester.com/admin/tasks";
    String buttonNewTask = "//a[normalize-space()='New Task']";
    String buttonTasksOverview = "//a[normalize-space()='Tasks Overview']";
    String buttonFilterBy = "//div[@id='vueApp']/descendant::button";
    String buttonBackToTasksList = "//a[normalize-space()='Back to tasks list']";
    String dropdownStaffMember = "//button[@data-id='member']";
    String inputStaffMember = "//button[@data-id='member']/following-sibling::div/descendant::input";
    String dropdownMonth = "//button[@data-id='month']";
    String inputMonth = "//button[@data-id='month']/following-sibling::div/descendant::input";
    String dropdownStatus = "//button[@data-id='status']";
    String dropdownYear = "//button[@data-id='year']";
    String buttonFilter = "//button[text()='Filter']";
    //Tasks Summary
    String headerTasksSummary = "//h4[normalize-space()='Tasks Summary']";
    String labelNotStarted = "//span[normalize-space()='Not Started']";
    String labelNotStartedNumber = "//span[normalize-space()='Not Started']/preceding-sibling::span";
    String labelNotStartedTasksAssigned = "//span[normalize-space()='Not Started']/parent::div/following-sibling::p";
    String labelInProgress = "//span[normalize-space()='In Progress']";
    String labelInProgressNumber = "//span[normalize-space()='In Progress']/preceding-sibling::span";
    String labelInProgressTasksAssigned = "//span[normalize-space()='In Progress']/parent::div/following-sibling::p";
    String labelTesting = "//span[normalize-space()='Testing']";
    String labelTestingNumber = "//span[normalize-space()='Testing']/preceding-sibling::span";
    String labelTestingTasksAssigned = "//span[normalize-space()='Testing']/parent::div/following-sibling::p";
    String labelAwaitingFeedback = "//span[normalize-space()='Awaiting Feedback']";
    String labelAwaitingFeedbackNumber = "//span[normalize-space()='Awaiting Feedback']/preceding-sibling::span";
    String labelAwaitingFeedbackTasksAssigned = "//span[normalize-space()='Awaiting Feedback']/parent::div/following-sibling::p";
    String labelComplete = "//span[normalize-space()='Complete']";
    String labelCompleteNumber = "//span[normalize-space()='Complete']/preceding-sibling::span";
    String labelCompleteTasksAssigned = "//span[normalize-space()='Complete']/parent::div/following-sibling::p";
    String inputSearchTask = "//div[@id='tasks_filter']//input[@type='search']";
    String inputTaskLength = "//div[@id='tasks_length']//select[@name='tasks_length']";
    String buttonExport = "//button[normalize-space()='Export']";
    String buttonBulkActions = "//button[normalize-space()='Bulk Actions']";
    String buttonReload = "//button[@title='Reload']";
    //locator for Tasks table
    //header
    String rowHead = "//tr[@role='row']";
    String inputCheckbox = "//input[@id='mass_select_all']";
    String labelSTT = "//th[text()='#']";
    String labelName = "//th[text()='Name']";
    String labelStatus = "//th[text()='Status']";
    String labelStartDate = "//th[text()='Start Date']";
    String labelDueDate = "//th[text()='Due Date']";
    String labelAssignedTo = "//th[text()='Assigned to']";
    String labelTags = "//th[text()='Tags']";
    String labelPriority = "//th[text()='Priority']";
    //body
    String rowBody = "//table[@id='tasks']//tbody/child::tr[1]";
    String rowBodyColumnName = "//table[@id='tasks']//tbody/child::tr[1]/child::td[3]";
    String iconStartTimer = "//table[@id='tasks']//tbody/child::tr[1]/child::td[3]//a[normalize-space()='Start Timer']";
    String iconEdit = "//table[@id='tasks']//tbody/child::tr[1]/child::td[3]//a[normalize-space()='Edit']";
    String iconDelete = "//table[@id='tasks']//tbody/child::tr[1]/child::td[3]//a[normalize-space()='Delete']";
    String labelRecordCount = "//div[@id='tasks_info']";
    String buttonPrevious = "//li[@id='tasks_previous']/a[normalize-space()='Previous']";
    String buttonNumber = "//li[@id='tasks_previous']/following-sibling::li/a";
    String buttonNext = "//li[@id='tasks_next']//a[text()='Next']";
    String selectNumberPage = "//select[@id='dt-page-jump-tasks']";
    //locator for Add New Task
    String headAddNewTask = "//h4[normalize-space()='Add new task']";
    String checkboxPublic = "//input[@id='task_is_public']";
    String checkboxBillable = "//input[@id='task_is_billable']";
    String buttonAttachFiles = "//a[normalize-space()='Attach Files']";
    String inputSubject = "//input[@id='name']";
    String inputHourlyRate = "//input[@id='hourly_rate']";
    String inputStartDate = "//input[@id='startdate']";
    String inputDueDate = "//input[@id='duedate']";
    String comboboxPriority = "//button[@data-id='priority']";
    String comboboxRepeatEvery = "//button[@data-id='repeat_every']";
    String comboboxRelatedTo = "//button[@data-id='rel_type']";
    String comboboxAssignees = "//button[@data-id='assignees']";
    String inputAssignees = "//button[@data-id='assignees']/following-sibling::div/descendant::input";
    String comboboxFollowers = "//button[@data-id='followers[]']";
    String inputFollowers = "//button[@data-id='followers[]']/following-sibling::div/descendant::input";
    String multichoiceTags = "//label[@for='tags']/following-sibling::ul/descendant::input";
    //String multichoiceTags = "//input[@id='tags']/following-sibling::ul/descendant::input";
    String inputTaskDescription = "//textarea[@id='description']";
    String buttonClose = "//form[@id='task-form']//button[normalize-space()='Close']";
    String buttonSave = "//form[@id='task-form']//button[normalize-space()='Save']";
}
