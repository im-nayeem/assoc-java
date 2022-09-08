import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created on 08-Sep-22
 *
 * @author Nayeem
 */
@WebFilter(filterName = "InitFilter",urlPatterns = {"/*"})
public class InitFilter implements Filter {
    public void init(FilterConfig config) throws ServletException {
    }

    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse resp = (HttpServletResponse) response;
        if(req.getServletPath().equals("/init") || req.getServletPath().contains("Admin") || req.getServletContext().getAttribute("assocInfo")!=null){
            chain.doFilter(req, resp);
        } else if (req.getServletPath().contains("admin") || req.getServletPath().contains("StoreInfo")) {
            chain.doFilter(req, resp);

        } else
            resp.sendRedirect("./");
    }
}
