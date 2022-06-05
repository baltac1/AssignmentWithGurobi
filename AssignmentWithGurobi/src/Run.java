/*
 * Q1 (100 pts) Assume that you need to assign 7 workers to 14 shifts. 
 * Names of the shifts are "Mon1", "Tue2", "Wed3", "Thu4", "Fri5", "Sat6", "Sun7", "Mon8", "Tue9", 
 * "Wed10", "Thu11", "Fri12", "Sat13", "Sun14". 
 * For each shift, there is a minimum required number of workers 
 * of 3, 2, 4, 4, 5, 6, 5, 2, 2, 3, 4, 6, 7, 5, respectively. 
 * Workers you need to assign are Amy, Bob, Cathy, Dan, Ed, Fred, and Gu. 
 * The amount you pay to each of these workers for a shift that they are 
 * assigned to is 10, 12, 10, 8, 8, 9, 11, respectively. 
 * Not every worker is available for every shift. The availability matrix is 
 * as follows, where rows represent workers and columns represent shifts:

int availability[] =

{{ 0, 1, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1 },

{ 1, 1, 0, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 0 },

{ 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },

{ 0, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1 },

{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 1, 1 },

{ 1, 1, 1, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 1 },

{ 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }};
 * Formulate a model where you try to minimize the total payment amount. Obtain the optimal solution 
 * using Gurobi. For each shift, print out the names of the workers that are assigned to that shift.
 * BONUS (20 pts)  Read the necessary data from a csv file and write the solution on 
 * another csv file. You must submit an example file in the format that you have written the read data code.
 * 
 */

import java.util.*;
import gurobi.*;
import java.io.*;
public class RunHW5 {

	public static void main(String[] args) throws IOException {
		FileWriter fileWriter = new FileWriter("data.csv");
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

		String[] jobNames = {"Mon1", "Tue2", "Wed3", "Thu4", "Fri5", "Sat6", "Sun7", "Mon8", "Tue9", "Wed10", "Thu11", "Fri12", "Sat13", "Sun14"};
		int[] workForceNeeded = {3, 2, 4, 4, 5, 6, 5, 2, 2, 3, 4, 6, 7, 5};

		String[] names = {"Amy", "Bob", "Cathy", "Dan", "Ed", "Fred", "Gu"};
		int[] wagesPerShift = {10, 12, 10, 8, 8, 9, 11};
		int[][] availabilities ={{ 0, 1, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1 },{ 1, 1, 0, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 0 },
				{ 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },{ 0, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1 },
				{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 1, 1 },{ 1, 1, 1, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 1 },
				{ 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }};

		// to write to a file from the data we have above
		/* 
		bufferedWriter.write("job_names,");
		for(String name: jobNames) {
			bufferedWriter.write(name+",");
		}
		bufferedWriter.write("\n");

		bufferedWriter.write("workforce_needed,");
		for(int i: workForceNeeded) {
			bufferedWriter.write(i+",");
		}
		bufferedWriter.write("\n");
		for(int i=0; i<names.length; i++) {
			String availability ="";
			for(int a: availabilities[i]) {
				availability += ""+a+",";
			}
			bufferedWriter.write(names[i]+","+availability + wagesPerShift[i]+"\n");
		}
		bufferedWriter.close();
		fileWriter.close();
		 */


		ArrayList<Worker> workers = new ArrayList<Worker>(); //to store our workers
		ArrayList<Job> jobs = new ArrayList<Job>(); //to store the jobs 

		FileReader fileReader = new FileReader("data.csv");
		BufferedReader bufferedReader = new BufferedReader(fileReader);

		
		// to read from a .csv file
		/*
		String line = bufferedReader.readLine();
		String[] jobNameArray = line.split(",");
		for(String name: jobNameArray) {
			if(!name.equals("job_names")) {
				Job job = new Job(name, -1);
				jobs.add(job);
			}
		}

		line = bufferedReader.readLine();
		String[] workForceNeededArray = line.split(",");
		for(int i=1; i<workForceNeededArray.length; i++) {
			jobs.get(i-1).setWorkForceNeeded(Integer.parseInt(workForceNeededArray[i]));
		}
		while(line != null) {
			line=bufferedReader.readLine();
			if(line != null) {
				String[] workerArray = line.split(",");
				Worker w = new Worker("", -1, null);
				w.setName(workerArray[0]);
				w.setWagePerShift(Integer.parseInt(workerArray[workerArray.length-1]));
				int[] a = new int[workerArray.length-2];
				for(int i=1; i<workerArray.length-1; i++) {
					a[i-1] = Integer.parseInt(workerArray[i]);
				}
				w.setAvailability(a);
				workers.add(w);
			}
			


		}
		*/
		
		
		for(int i=0; i<names.length; i++) {
			Worker worker = new Worker(names[i], wagesPerShift[i], availabilities[i]);
			workers.add(worker); // adding each worker to the arraylist.
		}
		for(int i=0; i<jobNames.length; i++) {
			Job job = new Job(jobNames[i], workForceNeeded[i]);
			jobs.add(job); // adding each job to the arraylist. 
		}


		try {
			GRBEnv env = new GRBEnv(true); // create the gurobi environment
			env.set("logFile", "assignment.log"); // set the logfile.
			env.start(); // start the env
			// Create empty model
			GRBModel model = new GRBModel(env);
			HashMap<String, GRBVar> X = new HashMap<String, GRBVar>();

			GRBLinExpr expr = new GRBLinExpr(); // our main expression, which we will minimize
			/*
			 * I modeled the assignment problem as follows:
			 * 		minimize sum(isAvailable * workerWage * GRBVar) over each worker and job,
			 * 			where isAvailable = 0 if worker cannot work that day, isAvailable=1 otherwise.
			 * 			workerWage is the wage of the worker per shift
			 * 			GRBVar=1 if worker is chosen to work that day, GRBVar=0 otherwise.
			 * 
			 * 		Subject to the following constraints:
			 * 			for each job,
			 * 				number of total workers working that shift >= work force needed for the job.
			 */

			int i=0; // to iterate over the availability array for each worker
			for(Job j: jobs) { // for each job

				GRBLinExpr constraintExpression = new GRBLinExpr(); // create a blank expression for constraints
				for(Worker w: workers) {

					GRBVar newVar = model.addVar(0.0, 1.0, 0.0, GRB.BINARY, "X("+w.name+j.name+")"); // create a GRBVar with unique name, so that we can see which people are working on which days
					constraintExpression.addTerm(w.availability[i], newVar); // w.availability[i] is 0 if the current worker CANNOT work that shift, 1 otherwise.
					// newVar will be 0 if the current worker IS NOT working that shift, 1 otherwise
					// when iterated over each worker, we get the total number of workers working on the specific shift, which is the value we need for our constraints

					expr.addTerm(w.availability[i]*w.wagePerShift, newVar);  // add the total amount paid to the main expression
					X.put(w.name+j.name, newVar); 

				}
				model.addConstr(constraintExpression, GRB.GREATER_EQUAL, j.workForceNeeded, j.name); 
				i++;
			}

			model.setObjective(expr, GRB.MINIMIZE); // we want to minimize the total amount we pay
			model.write("shiftAssignment.lp");
			model.optimize();

			String result = "";
			for(String name: X.keySet()) {	// 
				if(X.get(name).get(GRB.DoubleAttr.X)> 0.0) { // if positive, the worker is working on the specific shift.
					result += name+" "+X.get(name).get(GRB.DoubleAttr.X)+" ,";
				}


			}
			System.out.println(result);
			model.dispose();
			env.dispose();
		}
		catch (GRBException e) {
			System.out.println("Error code: " + e.getErrorCode() + ". " +
					e.getMessage());
		}



	}
}
