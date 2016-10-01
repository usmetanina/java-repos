import java.util.Scanner;

public class Program {
	
	public static void queueOperation(Queue queue){
        Scanner in = new Scanner(System.in);

        while(true){
            System.out.println("1. �������� ������ � ����������� � �������");
            System.out.println("2. �������� ������ � ��������� ����������� �� ������� (��� �� �������� �� �������)");
            System.out.println("3. ������� ������ � ��������� ����������� �� �������");
            System.out.println("4. ������� ������ � ��������� �����������, ������������ ������� �� ��������� �������� ��������");
            System.out.println("5. ������� ������ �� �� ����������� ������ �� �������");
            System.out.println("6. �������� ������ �� �� ����������� ������ �� ������� (��� �� �������� �� �������)");
            System.out.println("7. ������� ������ �� �� ����������� ������ �� �������");
            System.out.println("8. �������� ��������� ������ �� �� ����������� ������");
            System.out.println("9. ��������� ��������� ������������ �����, ����������� � �������");
            System.out.println("10. �������� ������� (������� ��� ������)");
            System.out.println("11. ������� ��� ���������� ������� � ���� ������� �����, ��������������� �� �����������");
            System.out.println("0. ����� �� ���������");

            int actionNumber = in.nextInt();
            if(actionNumber == 0) break;
            else{
                switch (actionNumber) {
                    case 1:
                    	System.out.printf("������� id: ");
                        int id = in.nextInt();
                        System.out.printf("������� ���������: ");
                        int priority = in.nextInt();
                        System.out.printf("������� �����������: ");
                        int laboriousness = in.nextInt();
                        System.out.printf("������� ��������: ");
                        String description = in.next();
                        queue.addTask(new Task(id,priority, laboriousness, description));
                    case 2:
                        Task task = queue.readMaxPriorityTask();
                        System.out.println(task);
                        break;
                    case 3:
                        task = queue.deleteMaxPriorityTask();
                        System.out.println(task);
                        break;
                    case 4:
                        System.out.println("������� �������� �����������:");
                        task = queue.deleteTaskUsingPriority(in.nextInt());
                        System.out.println(task);
                        break;
                    case 5:
                        System.out.println("������� id:");
                        queue.deleteTaskUsingId(in.nextInt());
                        break;
                    case 6:
                        System.out.println("������� id:");
                        task = queue.readTaskUsingId(in.nextInt());
                        System.out.println(task);
                        break;
                    case 7:
                        System.out.println("������� id:");;
                        task = queue.deleteTaskUsingIdReturnTask(in.nextInt());
                        System.out.println(task);
                        break;
                    case 8:
                        System.out.println("������� id ���������� ������ � ����� ���������:");
                        queue.changePriorityTaskUsingId(in.nextInt(), in.nextInt());
                        break;
                    case 9:
                        int totalSumma = queue.calculateTotalLaboriousnessAllTask();
                        System.out.println(Integer.toString(totalSumma));
                        break;
                    case 10:
                        queue.clearQueue();
                        break;
                    case 11:
                        Task[] allTask = queue.getQueue();
                        for (Task object: allTask) {
                            System.out.println(object);
                        }
                        break;
                }
            }
        }
    }
	
	public static void main(String[] args)
	{
		Queue queue=new Queue();
		//����������
		queue.addTask(new Task(1,5,120,"����� ���������"));
		queue.addTask(new Task(2,1,80,"������ ���������"));
		queue.addTask(new Task(3,10,180,"������� ���������"));
		
		queueOperation(queue);//����������������
	}
}
