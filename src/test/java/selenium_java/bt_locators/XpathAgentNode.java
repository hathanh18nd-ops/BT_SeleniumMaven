package selenium_java.bt_locators;

public class XpathAgentNode {
    public static String url = "http://192.168.10.24/service";
    //locator for login page
    public static String buttonTaiKhoan = "//input[@id='username']";
    public static String buttonMatKhau = "//input[@id='password']";
    public static String buttonDangNhap = "//button/span[normalize-space()='Đăng nhập']";
    //locator for thêm mới dịch vụ
    public static String buttonThemMoi = "//span[normalize-space()='Thêm mới']";
    public static String nhapTenDichVu = "//div[@role='dialog']//input[@placeholder='Nhập tên dịch vụ']";
    public static String nhapMaDichVu = "//div[@role='dialog']//input[@placeholder='Nhập mã dịch vụ']";
    public static String nhapDoDaiToiDa = "//div[@role='dialog']//input[@placeholder='Nhập độ dài tối đa']";
    public static String nhapURL = "//div[@role='dialog']//input[@placeholder='Nhập URL']";
    public static String nhapClientId = "//div[@role='dialog']//input[@placeholder='Nhập Client-Id']";
    public static String nhapClientSecret = "//div[@role='dialog']//input[@placeholder='Nhập Client-Secret']";
    public static String dropdownContentType = "//div[@role='dialog']//input[@id='contentType']";
    public static String clickValueContentType = "//div[@role='dialog']//div[normalize-space()='XML']";
    public static String dropdownTrangThai = "//div[@role='dialog']//input[@id='status']";
    public static String clickValueTrangThai = "//div[@role='dialog']//span/span[normalize-space()='Hoạt động']";
    public static String nhapXSD = "//div[@role='dialog']//textarea[@id='xsdContent']";
    public static String buttonXacNhan = "//div[@role='dialog']//button/span[normalize-space()='Xác nhận']";
}
