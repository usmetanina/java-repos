package webApplication.servletWithSpring.controller;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.compress.compressors.xz.XZCompressorInputStream;
import org.apache.commons.compress.compressors.xz.XZCompressorOutputStream;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

@Controller
@RequestMapping("/")
public class HelloWorldController {

    @RequestMapping(method = RequestMethod.GET)
    public String start(Model model)
    {
        return "index";
    }

    @RequestMapping(value = "encoder", method = RequestMethod.POST)
    public ModelAndView encode(@RequestParam(value = "src") String src) throws IOException {

        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        XZCompressorOutputStream xzOut = new XZCompressorOutputStream(bout);
        xzOut.write(src.getBytes());
        xzOut.close();

        String result = Base64.encodeBase64String(bout.toByteArray());

        ModelAndView mv = new ModelAndView("index");
        mv.addObject("result", result);

        return mv;
    }

    @RequestMapping(value = "decoder", method = RequestMethod.POST)
    public ModelAndView decode(@RequestParam(value = "src") String src)
    {
        String result;
        try
        {
            byte[] valueDecoded = Base64.decodeBase64(src);

            ByteArrayInputStream bIn = new ByteArrayInputStream(valueDecoded);
            XZCompressorInputStream xzIn = new XZCompressorInputStream(bIn);

            byte[] resultString = new byte[valueDecoded.length];
            xzIn.read(resultString);
            xzIn.close();

            result = new String(resultString);
        }
        catch (Exception e)
        {
            result = "Incorrect line!";
        }

        ModelAndView mv = new ModelAndView("index");
        mv.addObject("result", result);

        return mv;
    }

}