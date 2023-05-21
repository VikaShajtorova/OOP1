package exception;

import java.util.Scanner;

public class DataProcessingService {
    Scanner scanner = new Scanner(System.in);
    DataService service = new LocalMemoryService();
    public void enterWord(){
        while (true){
            String next = scanner.next();
            if ("exit".equals(next)){
                break;
            }else if("get".equals(next)){
                try {
                    System.out.println(service.get());
                }catch (NoSuchElementException exception1){
                    System.out.println("no elements");
                }
            }else {
                try {
                    service.add((next));
                }catch (LowMemoryException exception2){
                    System.out.println("memory is full");
                }
            }
        }
    }
}
