package org.geektimes.web.mvc.header;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class CacheControllerHeaderWriter implements HeaderWriter {
    @Override
    public void write(Map<String, List<String>> headers, String... headValues) {
        headers.put("cache-control", Arrays.asList(headValues));
    }
}
