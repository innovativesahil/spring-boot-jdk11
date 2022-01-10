package sahil.springbootjava11demo.config.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import java.io.IOException;

@Component
public class AuthFilter implements Filter {
    private Logger logger = LoggerFactory.getLogger(AuthFilter.class);
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        logger.info("authenticated");
        chain.doFilter(request,response);
    }
}
