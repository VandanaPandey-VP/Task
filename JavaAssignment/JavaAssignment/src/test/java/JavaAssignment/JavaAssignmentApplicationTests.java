package JavaAssignment;

import JavaAssignment.Entity.Employee;
import JavaAssignment.Services.EmployeeServices;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import static org.mockito.ArgumentMatchers.anyList;
import static org.mockito.Mockito.when;
import static org.springframework.mock.http.server.reactive.MockServerHttpRequest.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@WebMvcTest(JavaAssignmentApplicationTests.class)
class JavaAssignmentApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@Autowired
	private EmployeeServices employeeServices;

	@Test
	public void testCreateEmployees() throws Exception {


		List<Employee> employees = Arrays.asList(
				new Employee("Vandana", "Healthcare", 5000, "INR", LocalDate.of(2022, 5, 20), LocalDate.of(2023, 5, 20))
		);

		when(employeeServices.saveEmployees(anyList())).thenReturn(employees);

//		mockMvc.perform(post("/tci/employee-bonus")
//						.contentType(MediaType.APPLICATION_JSON)
//						.content("[{\"empName\": \"Vandana\", \"department\": \"Healthcare\", \"amount\": 5000, \"currency\": \"INR\", \"joiningDate\": \"2022-05-20\", \"exitDate\": \"2023-05-20\"}]"))
//				.andExpect(status().isOk());









	}
}
