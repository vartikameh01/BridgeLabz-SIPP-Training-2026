class LibraryMember {
    String memberName, memberId;

    LibraryMember(String memberName, String memberId) {
        this.memberName = memberName;
        this.memberId = memberId;
    }

    int calculateFine(int days) {
        return 0;
    }

    void printDetails() {
        System.out.println(memberName + "  " + memberId);
    }
}

class StudentMember extends LibraryMember {

    StudentMember(String n, String id) {
        super(n, id);
    }

    int calculateFine(int days) {
        return days * 2;
    }
}

class FacultyMember extends LibraryMember {

    FacultyMember(String n, String id) {
        super(n, id);
    }

    int calculateFine(int days) {
        return days * 1;
    }
}

class GuestMember extends LibraryMember {

    GuestMember(String n, String id) {
        super(n, id);
    }

    int calculateFine(int days) {
        return days * 5;
    }
}

public class LibraryDemo {

    static void search(LibraryMember[] m, String id) {
        for (LibraryMember x : m) {
            if (x.memberId.equals(id)) {
                System.out.println("\nMember Found:");
                x.printDetails();
                return;
            }
        }
        System.out.println("Member not found");
    }

    public static void main(String[] args) {

        LibraryMember[] m = {
                new StudentMember("Aman", "S101"),
                new FacultyMember("Rahul", "F201"),
                new GuestMember("Priya", "G301")
        };

        System.out.println("Member Details:");
        for (LibraryMember x : m) {
            x.printDetails();
            System.out.println("Fine for 5 days = " + x.calculateFine(5));
        }

        search(m, "F201");
    }
}