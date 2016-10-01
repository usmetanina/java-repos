
public class Queue {
	private int maxSize;
	private Task[] queArrayTask;
	private int nItems;
	
	public Queue()
	{
		maxSize=2;
		queArrayTask=new Task[maxSize];
		nItems=0;
	}
	
	public void addTask(Task task)
	{
		if (isFull()) 
		{
			maxSize*=2;
			Task[] newArrayTask = new Task[maxSize];

            for(int i = 0; i < nItems; i++){
                newArrayTask[i] = queArrayTask[i];
            }
            queArrayTask = newArrayTask;
		}
		
		if (isUniqueId(task))
		{
			int i;
			if (nItems==0)
				queArrayTask[nItems++]=task;
			else
			{
				for (i=nItems-1;i>=0;i--)
				{
					if (task.getPriority()>queArrayTask[i].getPriority())
						queArrayTask[i+1]=queArrayTask[i];
					else 
						break;
				}
				queArrayTask[i+1]=task;
				nItems++;
			}
		}
	}
	
	public Task readMaxPriorityTask()
	{
		if (!isEmpty())
			return queArrayTask[nItems-1];
		else return null;
	}
	
	public Task deleteMaxPriorityTask()
	{
		if (!isEmpty())
			return queArrayTask[--nItems];
		else 
			return null;
	}
	
	public Task deleteTaskUsingPriority(int laboriousness)
	{
		if (!isEmpty())
		{
			int i;
			Task requisiteTask=null;
			for (i=nItems-1;i>=0;i--) //перебираем задачи
			{
				if (queArrayTask[i].getLaboriousness()<=laboriousness)//если трудоёмкость не больше нужной
					requisiteTask=queArrayTask[i];//запоминаем
				break;
			}
			for (;i< nItems-2;i++) //передвигаем все задачи
			{
				queArrayTask[i]=queArrayTask[i+1];
			}
			nItems--; //уменьшили кол-во
			return requisiteTask;
		}
		else return null;
	}
	
	public void deleteTaskUsingId(int id)
	{
		if (!isEmpty())
		{
			int i;
			for (i=nItems-1;i>=0;i--) //перебираем задачи
			{
				if (queArrayTask[i].getId()==id)//если id совпали
					break;
			}
			for (;i< nItems-2;i++) //передвигаем все задачи
			{
				queArrayTask[i]=queArrayTask[i+1];
			}
			nItems--; //уменьшили кол-во
		}
	}
	
	public Task readTaskUsingId(int id)
	{
		if (!isEmpty())
		{
			int i;
			for (i=nItems-1;i>=0;i--) //перебираем задачи
			{
				if (queArrayTask[i].getId()==id)//если id совпали
					break;
			}
			return queArrayTask[i];
		}
		else return null;
	}
	
	public Task deleteTaskUsingIdReturnTask(int id)
	{
		if (!isEmpty())
		{
			int i;
			Task requisiteTask=null;
			for (i=nItems-1;i>=0;i--) //перебираем задачи
			{
				if (queArrayTask[i].getId()==id)//если id совпали
				{
					requisiteTask=queArrayTask[i];
					break;
				}
			}
			for (;i< nItems-2;i++) //передвигаем все задачи
			{
				queArrayTask[i]=queArrayTask[i+1];
			}
			nItems--; //уменьшили кол-во
			return requisiteTask;
		}
		else return null;
	}
	
	public void changePriorityTaskUsingId(int id,int priority)
	{
		if (!isEmpty())
		{
			Task changeableTask=this.deleteTaskUsingIdReturnTask(id);
			changeableTask.setPriority(priority);
			this.addTask(changeableTask);
		}
	}
	
	public int calculateTotalLaboriousnessAllTask()
	{
		int totalLaboriousness=0;
		for (int i=nItems-1;i>=0;i--) //перебираем задачи
		{
			totalLaboriousness+=queArrayTask[i].getLaboriousness();
		}
		return totalLaboriousness;
	}
	
	private boolean isFull()
	{
		return (nItems==maxSize);
	}
	
	private boolean isEmpty()
	{
		return (nItems==0);
	}
	
	private boolean isUniqueId(Task task)
	{
		for (int i=nItems-1;i>=0;i--) //перебираем задачи
		{
			if (queArrayTask[i].getId()==task.getId())
				return false;
		}
		return true;
	}
	
	public Task[] getQueue()
	{
		Task[] allTasks = new Task[nItems];
        for(int i = 0; i < nItems; i++){
            allTasks[i] = queArrayTask[i];
        }
        return allTasks;
	}
	
	public void clearQueue()
	{
		queArrayTask=new Task[0];
		nItems=0;
		maxSize=10;
	}
}
