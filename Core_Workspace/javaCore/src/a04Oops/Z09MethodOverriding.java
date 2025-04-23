package a04Oops;
class AA{
    public void show(){
        System.out.println("In Show method of Class A");
    }
    public void config(){
        System.out.println("In Config method of Class A");
    }
}

class BB extends AA{                                      // method present in childs clas gets the preference over parent class methods
    public void show(){
        System.out.println("In Show method of Class B");
    }

    public void config(){
        System.out.println("In Config method of Class B");
    }
}

public class Z09MethodOverriding {
    public static void main(String[] args) {
        BB obj = new BB();
        obj.show();
        obj.config();
    }
}
