package Person;

public class Doctor extends Professional{

    public Doctor(String cpf, String rg, String fullName, String address, String birthdate, String certificate, String specialization) {
        super(cpf, rg, fullName, address, birthdate, certificate, specialization);
    }

    @Override
    public String personInfo() {
        // TODO Auto-generated method stub
        return super.personInfo();
    }
    
}
