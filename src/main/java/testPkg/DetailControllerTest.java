package testPkg;

//import com.fasterxml.jackson.databind.ObjectMapper;
import com.test.DetailController;
import com.test.Location;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;


import static org.mockito.Matchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.forwardedUrl;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Created by deshan on 3/12/2018.
 */
public class DetailControllerTest
{
    @InjectMocks
    private DetailController detailController;

    private MockMvc mockMvc;

    @Before
    public void setup(){

        // Process mock annotations
        MockitoAnnotations.initMocks(this);

        // Setup Spring test in standalone mode
        this.mockMvc = MockMvcBuilders.standaloneSetup(detailController).build();

    }

    @Test
    public void testShow() throws Exception {

        /*when(sampleService.saveFrom(any(SignupForm.class)))
                .thenThrow(new InvalidUserException("For Testing"));*/

        ResultActions resultActions=this.mockMvc.perform(get("/api/test")
                                                .param("Test", "TestStr"));

        resultActions.andExpect( status().isOk() );
    }

    /*@Test
    public void testLocation() throws Exception {

        ResultActions resultActions=this.mockMvc.perform(get("/api/location"));
        ObjectMapper objectMapper = new ObjectMapper();

        resultActions.andExpect( status().isOk() );//status test
        MvcResult result=resultActions.andReturn();
        String content=result.getResponse().getContentAsString();
        Location location = objectMapper.readValue(content, Location.class);
        Assert.assertEquals( location.getLatitude(),"85" );//latitude lest
        Assert.assertEquals( location.getLongitude(),"90" );
    }*/

}
