/* Day 12 - Revision for the day - 15.07.2025

At a busy train station, passengers are queued up to board the train. However, senior citizens (age 60 and above) should be allowed to board first, regardless of when they entered the queue. Others follow the FIFO order.

You are to build a Queue Management System that supports:

1.Add a passenger (name, age, ticketType)

2.Board the next passenger (Senior first, then others in order)

3.Display passengers in both queues

4.Check if all queues are empty */

public class pltDayTwelve 
{
    
    public static void main(String[] args) 
    {
        QueueManagementSystem qms = new QueueManagementSystem();
        
        // Adding passengers
        qms.addPassenger("Alice", 65, "First Class");
        qms.addPassenger("Bob", 30, "Economy");
        qms.addPassenger("Charlie", 70, "Business");
        qms.addPassenger("David", 25, "Economy");
        
        // Displaying passengers
        System.out.println("Senior Citizens Queue:");
        qms.displaySeniorQueue();
        
        System.out.println("Regular Passengers Queue:");
        qms.displayRegularQueue();
        
        // Boarding passengers
        System.out.println("\nBoarding next passenger: " + qms.boardNextPassenger());
        System.out.println("Boarding next passenger: " + qms.boardNextPassenger());
        
        // Checking if all queues are empty
        System.out.println("\nAre all queues empty? " + qms.areAllQueuesEmpty());
    }

    static class Passenger 
    {
        String name;
        int age;
        String ticketType;

        Passenger(String name, int age, String ticketType) {
            this.name = name;
            this.age = age;
            this.ticketType = ticketType;
        }
    }
    static class QueueManagementSystem {
        private java.util.Queue<Passenger> seniorQueue = new java.util.LinkedList<>();
        private java.util.Queue<Passenger> regularQueue = new java.util.LinkedList<>();

        public void addPassenger(String name, int age, String ticketType) {
            Passenger passenger = new Passenger(name, age, ticketType);
            if (age >= 60) 
            {
                seniorQueue.add(passenger);
            } 
            else 
            {
                regularQueue.add(passenger);
            }
        }

        public String boardNextPassenger() {
            if (!seniorQueue.isEmpty())
             {
                return seniorQueue.poll().name;
            } 
            else if (!regularQueue.isEmpty())
             {
                return regularQueue.poll().name;
            } 
            else 
            {
                return "No passengers to board.";
            }
        }

        public void displaySeniorQueue() 
        {
            for (Passenger p : seniorQueue) 
            {
                System.out.println(p.name + " (" + p.age + ", " + p.ticketType + ")");
            }
        }

        public void displayRegularQueue() {
            for (Passenger p : regularQueue)
             {
                System.out.println(p.name + " (" + p.age + ", " + p.ticketType + ")");
            }
        }

        public boolean areAllQueuesEmpty() 
        {
            return seniorQueue.isEmpty() && regularQueue.isEmpty();
        }
    }

    @Override
    public String toString()
     {
        return "pltDayTwelve{}";
    }

}
