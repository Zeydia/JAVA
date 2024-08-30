import java.lang.Thread;
import java.util.concurrent.Executors;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/*
	MultiThread: avec la creation de thread pour chaque tache qui
			s'executerons en mm temps
	SingleThreadExecutor: avec la creation d'un thread pour toutes
			les taches 

	ExecutorService: pour mieux gerer les executions avec:
		> newCachedThreadPool()
		> newFixedThreadPool(n)

	Future: pour recuperer la tache
	 .get(), .isDone(), isCancelled()
*/

public class Main extends Thread
{
	// public void run()
	// {
	// 	for(int i = 0; i < 5; i++)
	// 	{
	// 		System.out.println("Je suis le traitement "+i);
	// 		try
	// 		{
	// 			Thread.sleep(1000);
	// 		}
	// 		catch(InterruptedException e)
	// 		{
	// 			System.out.println("Traitement interrompu!!");
	// 		}

	// 	}
	// }

	public static void main(String[] args) 
	{
		// Main task1 = new Main();
		// Main task2 = new Main();

		// task1.start();
		// task2.start();

	//-----------------------------------------------//
		Executor ex = Executors.newSingleThreadExecutor();

		Runnable task1 = () -> {
			System.out.println("Je suis le traitement 1....");
			try{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{System.out.println("Non executer");}
			
		};


		Runnable task2 = () -> {
			System.out.println("Je suis le traitement 2....");
			try{
				Thread.sleep(1000);
			}
			catch(InterruptedException e){System.out.println("Non executer");}
			
		};

		//ex.execute(task1);
		//ex.execute(task2);

		Future<?> fut1 = ex.submit(task1);
		Future<?> fut2 = ex.submit(task2);

		ex.shutdown();

	}
}