package kedaxunfeiTest;

import com.sun.deploy.util.StringUtils;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<String> arrayList = new ArrayList<>();
    public static void main(String[] args) {
        arrayList.add("zhangsan");
        arrayList.add("lisi");
        while(true){
            Scanner sc = new Scanner(System.in);
            String name = sc.nextLine();
            String psw = sc.nextLine();
            String phone = sc.nextLine();
            check(name,psw,phone);
        }
    }
    private static void check(String name, String psw, String phone) {
        if(arrayList.contains(name)){
            System.out.println("该用户名已存在");
            return;
        }
        boolean isDigit = false;
        boolean isLetter = false;
        for(int i = 0; i < psw.length();i++){
            if(Character.isDigit(psw.charAt(i))) {
                isDigit = true;
            }else if(Character.isLetter(psw.charAt(i))){
                isLetter = true;
            }
        }
        String reg = "^[a-zA-Z0-9]{8,16}$";
        if(!psw.matches(reg)){
            System.out.println("密码格式错误");
            return;
        }
        //String phoneReg = "^1[0-9]\\d{10}$";
        if(phone.length()!=11 || phone.charAt(0)!='1'){
            System.out.println("请输入正确的手机号码");
            return;
        }
        arrayList.add(name);
        System.out.println("注册成功");
        return;
    }
}
