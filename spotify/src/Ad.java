// Sample data:
// - ADDS
//  - ADD ING Bank, 0:20
//  - ADD Bol.com, 0:15
//  - ADD Albert Heijn, 0:30
//  - ADD Specsavers, 0:15
//  - ADD Kruidvat, 0:10
//  - ADD MediaMarkt.nl, 0:20
//  - ADD KPN, 0:30
//  - ADD TU Delft, 0:15
//  - ADD ABN Amro, 0:30
//  - ADD Rabobank, 0:15

// Fields of individual song:
// title, duration

public class Ad extends Sound {
    public Ad(String title, String duration) {
        super(title, duration);
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
