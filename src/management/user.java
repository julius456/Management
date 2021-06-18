
package management;



public class user {
    
    private int patient_id;
    private String name;
    private int age;
    private String bhw;
    private String baranggay;
    private String status;
    
    
        public user( int Id, String Name,int Age, String Bhw, String Baranggay, String Status)
        {
            this.patient_id = Id;
            this.name = Name;
            this.age = Age;
            this.bhw = Bhw;
            this.baranggay = Baranggay;
            this.status = Status;
        }
        public int getId()
        {
            return patient_id;
        }
                
        public String getName()
        {
            return name;
        }
        public int getAge()
        {
            return age;
        }
        public String getBhw()
        {
            return bhw;
        }
        public String getBaranggay()
        {
            return status;
        }

    Object getStatus() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void add(user patient_information) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
