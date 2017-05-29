
import play.api.mvc.{Action,Controller}

import play.api.data.validation.Constraint

import play.api.i18n.MessagesApi

import play.api.inject.{ApplicationLifecycle,ConfigurationProvider}

import de.zalando.play.controllers._

import PlayBodyParsing._

import PlayValidations._

import scala.util._

import javax.inject._

import it.gov.daf.catalogmanager.service.ServiceRegistry
import scala.concurrent.Future

/**
 * This controller is re-generated after each change in the specification.
 * Please only place your hand-written code between appropriate comments in the body of the controller.
 */

package catalog_manager.yaml {
    // ----- Start of unmanaged code area for package Catalog_managerYaml
        
    // ----- End of unmanaged code area for package Catalog_managerYaml
    class Catalog_managerYaml @Inject() (
        // ----- Start of unmanaged code area for injections Catalog_managerYaml

        // ----- End of unmanaged code area for injections Catalog_managerYaml
        val messagesApi: MessagesApi,
        lifecycle: ApplicationLifecycle,
        config: ConfigurationProvider
    ) extends Catalog_managerYamlBase {
        // ----- Start of unmanaged code area for constructor Catalog_managerYaml

        // ----- End of unmanaged code area for constructor Catalog_managerYaml
        val datasetcatalogs = datasetcatalogsAction {  _ =>  
            // ----- Start of unmanaged code area for action  Catalog_managerYaml.datasetcatalogs
            val catalogs = ServiceRegistry.catalogService.listCatalogs()
            Datasetcatalogs200(catalogs)
            // ----- End of unmanaged code area for action  Catalog_managerYaml.datasetcatalogs
        }
        val gettest = gettestAction {  _ =>  
            // ----- Start of unmanaged code area for action  Catalog_managerYaml.gettest
            Gettest200(Token(None))
            //NotImplementedYet
            // ----- End of unmanaged code area for action  Catalog_managerYaml.gettest
        }
        val createckandataset = createckandatasetAction { (dataset: Dataset) =>  
            // ----- Start of unmanaged code area for action  Catalog_managerYaml.createckandataset
            NotImplementedYet
            // ----- End of unmanaged code area for action  Catalog_managerYaml.createckandataset
        }
        val datasetcatalogbyid = datasetcatalogbyidAction { (catalog_id: String) =>  
            // ----- Start of unmanaged code area for action  Catalog_managerYaml.datasetcatalogbyid
            val calalog = ServiceRegistry.catalogService.getCatalogs(catalog_id)
            Datasetcatalogbyid200(calalog)
            //NotImplementedYet
            // ----- End of unmanaged code area for action  Catalog_managerYaml.datasetcatalogbyid
        }
        val ckandatasetbyid = ckandatasetbyidAction { (dataset_id: String) =>  
            // ----- Start of unmanaged code area for action  Catalog_managerYaml.ckandatasetbyid
            val dataset: Future[Dataset] = ServiceRegistry.catalogService.getDataset(dataset_id)
            Ckandatasetbyid200(dataset)
            //NotImplementedYet
            // ----- End of unmanaged code area for action  Catalog_managerYaml.ckandatasetbyid
        }
        val createdatasetcatalog = createdatasetcatalogAction { (catalog: MetaCatalog) =>  
            // ----- Start of unmanaged code area for action  Catalog_managerYaml.createdatasetcatalog
            val created: Successf = ServiceRegistry.catalogService.createCatalog(catalog)
            Createdatasetcatalog200(created)
           //NotImplementedYet
            // ----- End of unmanaged code area for action  Catalog_managerYaml.createdatasetcatalog
        }
    
    }
}