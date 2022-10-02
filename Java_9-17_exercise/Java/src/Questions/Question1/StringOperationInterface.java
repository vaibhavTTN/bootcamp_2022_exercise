package Questions.Question1;

public interface StringOperationInterface {
    private String revers(String str){
        StringBuilder string = new StringBuilder(str);
        return string.reverse().toString();
    }

    private String upperCase(String str){
        return str.toUpperCase();
    }

    private String lowerCase(String str){
        return str.toLowerCase();
    }

    default void method(String str){
        System.out.println(revers(str));
        System.out.println(upperCase(str));
        System.out.println(lowerCase(str));

    }

}
