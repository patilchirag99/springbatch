Spring batch: 

For example: Consider transferring data from CSV to Database

Understand source(CSV) and destination(DB)

ItemReader - Reads the data from source.
ItemProcessor - Processes the data obtained from the source before writing
ItemWriter - Write the data to destination.

Step:
These three(flow) are together called as one step.
We can have multiple step each contains one task consisting of ItemReader, ItemProcessor and  ItemWriter

Job:
To execute each step we need a Job.

JobLauncher:
Used to launch the job execution.

JobRepository:
All this will me maintained in a component called JobRepository

Steps:
1. Create spring starter project
2. Configure datasource properties in application.properties
3. Keep the source file (.csv) in src/main/resources
4. Create Entity class and Repository  class
5. Create Batch configuration class. (Need to specify our Job, Step, ItemReader, ItemProcessor, ItemWriter) and  we will launch JobLauncher from our controller
