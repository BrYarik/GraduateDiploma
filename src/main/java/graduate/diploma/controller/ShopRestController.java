package graduate.diploma.controller;

import graduate.diploma.domain.WebUser;
import graduate.diploma.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShopRestController {
    @Autowired
    private CategoryService categoryService;
    @Autowired
    private GoodsService goodsService;
    @Autowired
    private ManufacturerService manufacturerService;
    @Autowired
    private ModelService modelService;
    @Autowired
    private PictureService pictureService;
    @Autowired
    private UserService userService;

    @PutMapping("/user/reg")
    public String addUser(@RequestBody WebUser webUser) {
        if ( userService.findByLogin(webUser.getLogin()) == null ) {
            userService.addUser(webUser);

            return "Registration Successful";
        }

        return "Login already exist";
    }
}
