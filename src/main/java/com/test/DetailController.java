package com.test;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by deshan on 3/9/2018.
 */

@RestController
public class DetailController
{
    @ApiOperation(value = "get location details", notes = "Returning Location Results")
    @ApiResponses(value = { @ApiResponse(code = 200, message = "A Location", response = Location.class) })
    @RequestMapping(method = RequestMethod.GET, value = "api/location")
    public ResponseEntity<Location> getLocationDetails()
    {
        Location location=new Location( "85" , "90");
        return new ResponseEntity<Location>( location , HttpStatus.OK );
    }

    @ApiOperation(value = "display value", notes = "display value entered")
    @ApiResponses(value = { @ApiResponse(code = 200, message = "A Text") })
    @RequestMapping(method = RequestMethod.GET, value = "api/test")
    public ResponseEntity<String> show(
            @ApiParam(value = "Test", hidden = false) @RequestParam(value = "Test", required = false) String str )
    {
        return new ResponseEntity<String>( str , HttpStatus.OK );
    }
}
