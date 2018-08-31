package com.danny.demogoogle.callback

import com.danny.demogoogle.auth.AuthConstant
import com.danny.demogoogle.callback.CallbackConstant.AUTHORIZATION.KEY_CODE
import com.danny.demogoogle.callback.CallbackConstant.CONTROLLER.PATH_CALLBACK
import com.danny.demogoogle.callback.CallbackConstant.CONTROLLER.PATH_V1
import com.danny.demogoogle.callback.CallbackConstant.CONTROLLER.VIEW_COMPLETE
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.servlet.ModelAndView
import javax.servlet.http.HttpServletRequest

@Controller
@RequestMapping(PATH_V1)
class CallbackController{

    @GetMapping(PATH_CALLBACK)
    fun goToCallbackPage(
        request: HttpServletRequest,
        @RequestParam(value = KEY_CODE, required = false) code: String?
    ): ModelAndView{

        return ModelAndView(VIEW_COMPLETE)
    }
}