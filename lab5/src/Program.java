import java.util.Scanner;

public class Program {
	
	public static void queueOperation(Queue queue){
        Scanner in = new Scanner(System.in);

        while(true){
            System.out.println("1. Добавить задачу с приоритетом в очередь");
            System.out.println("2. Получить задачу с наивысшим приоритетом из очереди (без ее удаления из очереди)");
            System.out.println("3. Извлечь задачу с наивысшим приоритетом из очереди");
            System.out.println("4. Извлечь задачу с наивысшим приоритетом, трудоемкость которой не превышает заданное значение");
            System.out.println("5. Удалить задачу по ее уникальному номеру из очереди");
            System.out.println("6. Получить задачу по ее уникальному номеру из очереди (без ее удаления из очереди)");
            System.out.println("7. Извлечь задачу по ее уникальному номеру из очереди");
            System.out.println("8. Изменить приоритет задачи по ее уникальному номеру");
            System.out.println("9. Вычислить суммарную трудоемкость задач, находящихся в очереди");
            System.out.println("10. Очистить очередь (удалить все задачи)");
            System.out.println("11. Вернуть все содержимое очереди в виде массива задач, отсортированных по приоритетам");
            System.out.println("0. Выйти из программы");

            int actionNumber = in.nextInt();
            if(actionNumber == 0) break;
            else{
                switch (actionNumber) {
                    case 1:
                    	System.out.printf("Введите id: ");
                        int id = in.nextInt();
                        System.out.printf("Введите приоритет: ");
                        int priority = in.nextInt();
                        System.out.printf("Введите трудоёмкость: ");
                        int laboriousness = in.nextInt();
                        System.out.printf("Введите описание: ");
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
                        System.out.println("Введите значение трудоёмкости:");
                        task = queue.deleteTaskUsingPriority(in.nextInt());
                        System.out.println(task);
                        break;
                    case 5:
                        System.out.println("Введите id:");
                        queue.deleteTaskUsingId(in.nextInt());
                        break;
                    case 6:
                        System.out.println("Введите id:");
                        task = queue.readTaskUsingId(in.nextInt());
                        System.out.println(task);
                        break;
                    case 7:
                        System.out.println("Введите id:");;
                        task = queue.deleteTaskUsingIdReturnTask(in.nextInt());
                        System.out.println(task);
                        break;
                    case 8:
                        System.out.println("Введите id изменяемой задачи и новый приоритет:");
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
		//наполнение
		queue.addTask(new Task(1,5,120,"пятый приоритет"));
		queue.addTask(new Task(2,1,80,"первый приоритет"));
		queue.addTask(new Task(3,10,180,"десятый приоритет"));
		
		queueOperation(queue);//функциональность
	}
}
