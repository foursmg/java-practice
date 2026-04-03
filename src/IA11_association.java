class Patient {
    String name;

    Patient(String name) {
        this.name = name;
    }
}

class Doctor {
    String docName;

    Doctor(String docName) {
        this.docName = docName;
    }

    void treat(Patient p) {
        System.out.println(docName + " treats " + p.name);
    }
}

public class IA11_association {
    public static void main(String[] args) {
        Patient p1 = new Patient("Ravi");
        Doctor d1 = new Doctor("Dr. Mehta");

        d1.treat(p1);
    }
}
