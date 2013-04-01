package lixeiraint;

import context.arch.discoverer.query.AbstractQueryItem;
import context.arch.enactor.Enactor;
import context.arch.enactor.EnactorXmlParser;
import context.arch.widget.Widget;
import context.arch.storage.Attributes;
import context.arch.widget.WidgetXmlParser;

/**
 *
 * @author Zeff
 */
public class LixeiraModel {
    
    protected Widget widgetLixeira;
    protected Widget widgetStatus;
    
    protected LixeiraGenerator generatorLixeira;
    protected Enactor enactorStatus;
    
    protected StatusService statusService;
    
    public static final String lixeira = "Lixeira Reciclagem 1";
    public static final String led = "Led";
    
    @SuppressWarnings ("serial")
    public LixeiraModel(LixeiraInt application){
            super();
            
            /*
             * Valores dos atributos constantes para descrever os widgets e instancia-los. 
             */
            Attributes lixeiraValConsAtrib = new Attributes(){{
                    addAttribute("lixeira", lixeira);
            }};
            Attributes ledValConsAtrib = new Attributes(){{
                    addAttribute("led", led);
            }};
            
            /*
             * Widget sensor da Lixeira
             */
            widgetLixeira = WidgetXmlParser.createWidget(
                    "src/lixeiraint/Widget-Lixeira.xml",
                    lixeira,
                    lixeiraValConsAtrib);
            
            /*
             * Widget atuador e Serviços
             */
            widgetStatus = WidgetXmlParser.createWidget(
                    "src/lixeiraint/Widget-Status-Lixeira.xml",
                    led,
                    ledValConsAtrib);
            statusService = new StatusService(widgetStatus, application);
            widgetStatus.addService(statusService);
            
            /*
             * Generator para Widget-Lixeira
             * Define valores de seus atributos através de método de invocação
             */
            AbstractQueryItem<?,?> lixeiraWidgetQuery = WidgetXmlParser.createWidgetSubscriptionQuery(
                                "src/lixeiraint/Widget-Liixeira.xml",
                                lixeira,
                                lixeiraValConsAtrib);
            generatorLixeira = new LixeiraGenerator(
                                lixeiraWidgetQuery,
                                lixeira);
            
            /*
             * Enactor usa as informações do Widget-Lixera para modificar os valores do Widget-Status-Lixeira
             */
            enactorStatus = EnactorXmlParser.createEnactor(
                                "src/lixeiraint/Enactor-Status.xml",
                                lixeira + '_' + led,
                                lixeiraValConsAtrib,
                                ledValConsAtrib);
    }
    
    /*
     * COnstrutor vazio para subclasses
     */
    public LixeiraModel() {}
    
}
