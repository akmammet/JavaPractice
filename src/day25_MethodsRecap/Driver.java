package day25_MethodsRecap;

public class Driver {

    public static void main(String[] args) {
        String str = getDriver1("chrome");
        System.out.println(str);

        String str2 = getDriver2("firefox");
        System.out.println(str2);

        String str3 = getDriver3("opera");
        System.out.println(str3);
    }

    public static String getDriver1(String browserName){
        String result= "";

        switch(browserName.toLowerCase()){
            case "chrome": result = "Chrome Driver";
                    break;

            case "firefox": result = "Firefox Driver";
                    break;

            case "safari" : result ="Safari Driver";
                    break;

            case "opera" : result = "Opera Driver";
                    break;

            case "edge" : result = "Edge Driver";
                    break;
            default: result = "Invalid Driver";
        }



        return result;
    }

    public static String getDriver2(String browserName){
        browserName = browserName.toLowerCase();
        String result ="";
        if (browserName.equals("chrome")){
           result = "Chrome driver";
        } else if (browserName.equals("safari")){
            result= "Safari";
        }else if (browserName.equals("firefox")) {
            result = "Firefox";
        } else if (browserName.equals("opera")) {
            result = "Opera";
        } else if (browserName.equals("edge")) {
            result = "Edge";
        } else {
            result = "Invalid Driver";
        }
        return result;
    }

    public static String getDriver3(String browserName){
        browserName = browserName.toLowerCase();
        String result = (browserName.equals("chrome"))? "Chrome Driver"
                        :(browserName.equals("firefox"))? "Firefox Driver"
                        :(browserName.equals("safari"))? "Safari"
                        :(browserName.equals("edge"))? "Edge"
                        :(browserName.equals("opera"))? "Opera"
                        :"Invalid Driver";
        return result;
    }

}
