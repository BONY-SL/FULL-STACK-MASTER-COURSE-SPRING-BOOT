package bean.example.bean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName = "prototype")
public class Doctor implements Staff{

    private String qulification;

    @Override
    public String toString() {
        return "Doctor{" +
                "qulification='" + qulification + '\'' +
                '}';
    }


    //    private Nurse nurse;

//    public Doctor(String qulification, Nurse nurse) {
//        this.qulification = qulification;
//        this.nurse = nurse;
//    }

    public String getQulification() {
        return qulification;
    }

    public void setQulification(String qulification) {
        this.qulification = qulification;
    }

    @Override
    public void assist(){
        System.out.println("I am a doctor");

    }


//    public Nurse getNurse() {
//        return nurse;
//    }
//
//    public void setNurse(Nurse nurse) {
//        this.nurse = nurse;
//    }
}
