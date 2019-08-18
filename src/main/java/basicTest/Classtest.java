package basicTest;

import model.HashcodeModel;
import org.junit.Test;

public class Classtest {

    @Test
    public void t1(){
        HashcodeModel hashcodeModel = new HashcodeModel();
        hashcodeModel.hashCode();
        System.out.println(hashcodeModel.hashCode());

        hashcodeModel.setId("asd");
        System.out.println(hashcodeModel.hashCode());


    }


}

