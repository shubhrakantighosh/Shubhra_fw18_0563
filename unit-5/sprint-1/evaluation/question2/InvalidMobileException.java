package question2;

import java.util.List;

public class InvalidMobileException extends Throwable {

    public List<String> getModels(String company)throws InvalidMobileException{

        getModels().forEach(models-> System.out.println(models));

        Exception exception;{
            System.out.println("h");
        }
        return null;
    }
}
