package webApplication.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayInputStream;
import java.io.IOException;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.compress.compressors.xz.XZCompressorInputStream;

@WebServlet("/decoder")
public class DecoderServlet extends HttpServlet
{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        try {
            String s = req.getParameter("src");

            byte[] valueDecoded = Base64.decodeBase64(s.getBytes());

            ByteArrayInputStream bIn = new ByteArrayInputStream(valueDecoded);
            XZCompressorInputStream xzIn = new XZCompressorInputStream(bIn);

            byte[] result = new byte[valueDecoded.length];
            xzIn.read(result);
            xzIn.close();

            String answer = new String(result).trim();

            req.setAttribute("result", answer);
            req.getRequestDispatcher("mypage.jsp").forward(req, resp);
        }
        catch (Exception e)
        {
            String answer = "Невозможно корректно расшифровать!";
            req.setAttribute("result", answer);
            req.getRequestDispatcher("mypage.jsp").forward(req, resp);
        }

    }
}
