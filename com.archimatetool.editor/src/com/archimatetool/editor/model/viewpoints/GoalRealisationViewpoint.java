/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package com.archimatetool.editor.model.viewpoints;

import org.eclipse.emf.ecore.EClass;

import com.archimatetool.model.IArchimatePackage;


/**
 * Goal Realisation Viewpoint
 * 
 * @author Phillip Beauvoir
 */
public class GoalRealisationViewpoint extends AbstractViewpoint {
    
    EClass[] allowed = new EClass[] {
            IArchimatePackage.eINSTANCE.getGoal(),
            IArchimatePackage.eINSTANCE.getPrinciple(),
            IArchimatePackage.eINSTANCE.getRequirement(),
            IArchimatePackage.eINSTANCE.getConstraint(),
            
            IArchimatePackage.eINSTANCE.getRealizationRelationship(),
            IArchimatePackage.eINSTANCE.getAggregationRelationship(),
            IArchimatePackage.eINSTANCE.getSpecializationRelationship(),
            IArchimatePackage.eINSTANCE.getCompositionRelationship(),
            IArchimatePackage.eINSTANCE.getAssociationRelationship(),
            IArchimatePackage.eINSTANCE.getInfluenceRelationship()
    };
    
    @Override
    public String getName() {
        return Messages.GoalRealisationViewpoint_0;
    }

    @Override
    public int getIndex() {
        return GOAL_REALISATION_VIEWPOINT;
    }
    
    @Override
    public EClass[] getAllowedTypes() {
        return allowed;
    }
}