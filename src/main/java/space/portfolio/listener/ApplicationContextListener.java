package space.portfolio.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class ApplicationContextListener implements ServletContextListener {

    private static final Logger LOGGER = LoggerFactory.getLogger(ApplicationContextListener.class);

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        LOGGER.debug("ApplicationContextListener void contextInitialized(...)");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        LOGGER.debug("ApplicationContextListener void contextDestroyed(...)");
    }
}
