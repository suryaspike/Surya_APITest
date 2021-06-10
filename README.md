# ******************Assignment **********************
1.	Set up a sample stub service on your local. Refer Section 1 for instructions to set it up.
2.	Create automated test cases using Rest Assured framework.Refer Section 2 for details.

## Section 1:
1.	Clone the repository:
https://github.com/auto-user/sampleStubService.git
2.	On the command prompt, navigate to the cloned repo project and run the following bat command
      _StartStubService.bat_
      This will start the API stub server
	
3. Open postman and import the collection provided in the repo
*TestCollection.postman_collection.json*
4.	Run the api endpoint
http://localhost:4547/Blog.Api/Customers
Response should have a list of test users
5.	Run the other examples in the collection and response would be returned
6.	The sample project runs on node v6.10.1

## Section 2:
1.	The following endpoints are provided:<br>
*Blog.Api/Customers – Lists all customers* <br>
*Blog.Api/1111/CustomerView* – Provides the details of customer with id 1111<br>
Other ids which will return results - 1111,2222,3333,4444,5555,6666
2.	Any other id outside of the above would result in customer not found

### Objective:
1.	Create a API test automation framework using rest assured
2.	Derive API test cases for the above endpoints and automate the test cases
3.	Check in the solution to your git repo and share the repo url
4.	Provide Readme on how to run the tests
5.	Any reporting framework can be used. Provide instructions to access the report
6.	Focus is on how code is written and coverage of test cases
