import models.CollegeStudent;
import models.Postgraduate;
import play.jobs.Job;
import play.jobs.OnApplicationStart;
import play.test.Fixtures;

@OnApplicationStart
public class Bootstrap extends Job {
	
	public void doJob() {
		// Check if the database is empty
		if(CollegeStudent.count() == 0 && Postgraduate.count() == 0) {
			Fixtures.loadModels("initial-data.yml");
		}
	}

}
