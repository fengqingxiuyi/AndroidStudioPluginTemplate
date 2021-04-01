package other

/**
 * @author fqxyi
 * @date 4/1/21
 */
import com.android.tools.idea.wizard.template.Template
import com.android.tools.idea.wizard.template.WizardTemplateProvider
import other.fengqingxiuyi.fengqingxiuyiTemplate

class WizardTemplateProviderImpl  : WizardTemplateProvider() {

    override fun getTemplates(): List<Template> = listOf(fengqingxiuyiTemplate)
}