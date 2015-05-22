package net.sion.company.demo.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import net.sion.core.admin.domain.Duties;
import net.sion.core.app.domain.App;
import net.sion.core.app.domain.Module;
import net.sion.core.app.domain.Role;
import net.sion.core.app.listener.AbstractAppRegisterListener;

@Component
public class DemoRegister extends AbstractAppRegisterListener {
	
	@Override
	public List<Module> registModule(List<Module> empty) {
		Module module1 = new Module("1000_1", "sion.demo", "例子学习");
		List<Module> modules = new ArrayList<Module>();
		module1.setAutoRun(true);
		modules.add(module1);
		empty.addAll(modules);
		return empty; 
	}
	
	@Override
	public List<App> registApp(List<App> empty) {
		empty.add(new App("1000","例子学习"));
		return empty;
	}
	
	@Override
	public List<Role> registRole(List<Role> empty) {
		Role role = new Role(new App("1000","例子学习"),"company","例子学习","例子学习");
		Module module1 = new Module("1000_1", "sion.demo", "例子学习");
		List<Module> modules = new ArrayList<Module>();
		modules.add(module1);
		role.addModules(modules);
		role.criteriaIn(new Duties[]{Duties.Admin,Duties.SuperAdmin});
		empty.add(role);
		return empty;
	}
}
