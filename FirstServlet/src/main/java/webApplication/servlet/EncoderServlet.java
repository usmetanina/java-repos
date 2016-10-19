package webApplication.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.compress.compressors.xz.XZCompressorOutputStream;

@WebServlet("/encoder")
public class EncoderServlet extends HttpServlet
{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String s = req.getParameter("src");

        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        XZCompressorOutputStream xzOut = new XZCompressorOutputStream(bout);
        xzOut.write(s.getBytes());
        xzOut.close();

        String result = Base64.encodeBase64String(bout.toByteArray());

        req.setAttribute("result", result);
        req.getRequestDispatcher("mypage.jsp").forward(req, resp);

    }
}
