import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created on 07-Sep-22
 *
 * @author Nayeem
 */
@WebFilter(filterName = "LoginFilter", servletNames = {"Dashboard","Members","Notice"})
public class LoginFilter implements Filter {
    public void init(FilterConfig config) throws ServletException {
    }

    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse resp = (HttpServletResponse) response;

        if(req.getSession().getAttribute("userProfile")!=null){
            chain.doFilter(req, resp);
        }
        else
            resp.sendRedirect("Login");


    }
}
