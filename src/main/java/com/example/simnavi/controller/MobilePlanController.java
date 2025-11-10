package com.example.simnavi.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.simnavi.form.MobilePlanForm;
import com.example.simnavi.model.MobilePlan;
import com.example.simnavi.repository.MobilePlanRepository;
import com.example.simnavi.service.MobilePlanService;

@Controller
public class MobilePlanController {
	private final MobilePlanRepository mobilePlanRepository;
	private final MobilePlanService mobilePlanService;

    // コンストラクタインジェクションでRepositoryを受け取ります
    public MobilePlanController(MobilePlanRepository mobilePlanRepository, MobilePlanService mobilePlanService) {
        this.mobilePlanRepository = mobilePlanRepository;
        this.mobilePlanService = mobilePlanService;
    }

    @GetMapping("/plan_list") // ルートURL (http://localhost:8080/) へのアクセスを処理
    public String listPlans(Model model) {
        // データベースから全てのSIMプランを取得します
        List<MobilePlan> plans = mobilePlanRepository.findAll();
        
        // 取得したプランのリストをThymeleafテンプレートに渡します
        model.addAttribute("plans", plans);
        
        // "plan_list.html" という名前のThymeleafテンプレートを返します
        return "plan_list"; 
    }
    
    @GetMapping("/plan_list/register")
    public String registerPlan(Model model) {
    	model.addAttribute("mobilePlanForm", new MobilePlanForm());
    	return "register";
    }
    
    @PostMapping("/plan_list/register/complete")
    public String registeredPlan(Model model, MobilePlanForm mobilePlanForm) {
    	mobilePlanService.createPlan(mobilePlanForm);
    	
    	return "redirect:/plan_list";
    }
    
    @PostMapping("/plan_list/delete/{id}")
    public String deleteSimInformation(@PathVariable Long id) {
    	mobilePlanService.delete(id);
    	return "redirect:/plan_list";
    }
    
    @GetMapping("/plan_list/update/{id}")
    public String updatePlan(@PathVariable Long id, Model model) {
    	MobilePlan mobilePlan = mobilePlanRepository.findById(id)
    			.orElseThrow(() -> new IllegalArgumentException("Invalid plan Id:" + id));
    	model.addAttribute("mobilePlan", mobilePlan);
    	
    	return "update";
    }
    
}
