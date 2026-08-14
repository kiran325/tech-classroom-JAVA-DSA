package ExecuteJava;

import java.util.LinkedList;
import java.util.Queue;

public class ProcessQueueUntilEmpty {

	public static void main(String[] args) {
		// Process Queue Until Empty : Used in automation frameworks for queue processing or batch jobs.
		
		Queue<String> jobs = new LinkedList<>();
		jobs.add("Job1");
		jobs.add("Job2");
		jobs.add("Job3");

		do {
		    String currentJob = jobs.poll();
		    System.out.println("Processing: " + currentJob);
		} while (!jobs.isEmpty());

	}

}


// Real Use Case: Execute all jobs or tasks until queue becomes empty.