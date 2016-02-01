package nl.cofano.hbrcrawler;

import com.ui4j.api.browser.BrowserEngine;
import com.ui4j.api.browser.Page;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import static com.ui4j.api.browser.BrowserFactory.getWebKit;

@Path("/test")
public class DummyResource {


    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Object hello() throws Exception {
        BrowserEngine browser = getWebKit();

        String request = "http://wildfly-swarm.io/";

        Page page = browser.navigate(request);
        return page.getDocument().getBody().getOuterHTML();

    }
}
