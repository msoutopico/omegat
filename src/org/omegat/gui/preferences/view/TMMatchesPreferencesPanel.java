/**************************************************************************
 OmegaT - Computer Assisted Translation (CAT) tool
          with fuzzy matching, translation memory, keyword search,
          glossaries, and translation leveraging into updated projects.

 Copyright (C) 2000-2006 Keith Godfrey and Maxym Mykhalchuk
               2010 Didier Briel
               2014-2016 Aaron Madlon-Kay
               2020 Briac Pilpre
               Home page: http://www.omegat.org/
               Support center: https://omegat.org/support

 This file is part of OmegaT.

 OmegaT is free software: you can redistribute it and/or modify
 it under the terms of the GNU General Public License as published by
 the Free Software Foundation, either version 3 of the License, or
 (at your option) any later version.

 OmegaT is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.

 You should have received a copy of the GNU General Public License
 along with this program.  If not, see <http://www.gnu.org/licenses/>.
 **************************************************************************/

package org.omegat.gui.preferences.view;

import java.awt.GridBagConstraints;

import javax.swing.JPanel;

import org.omegat.core.matching.NearString.SORT_KEY;
import org.omegat.util.OStrings;

/**
 * @author Maxym Mykhalchuk
 * @author Didier Briel
 * @author Aaron Madlon-Kay
 */
@SuppressWarnings("serial")
public class TMMatchesPreferencesPanel extends JPanel {

    /** Creates new form ExternalTMXMatchesPanel */
    public TMMatchesPreferencesPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        sortMatchesLabel = new javax.swing.JLabel();
        sortMatchesList = new javax.swing.JComboBox<>();
        fuzzyThresholdLabel = new javax.swing.JLabel();
        fuzzyMatchThreshold = new javax.swing.JSpinner();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        jPanel7 = new javax.swing.JPanel();
        tagHandlingLabel = new javax.swing.JLabel();
        displayLevel2Tags = new javax.swing.JCheckBox();
        useSlash = new javax.swing.JCheckBox();
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        jPanel5 = new javax.swing.JPanel();
        keepForeignMatches = new javax.swing.JCheckBox();
        foreignPenaltyPanel = new javax.swing.JPanel();
        foreignPenaltyLabel = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 32767));
        foreignPenaltySpinner = new javax.swing.JSpinner();
        filler4 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        jPanel3 = new javax.swing.JPanel();
        templateLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        matchesTemplate = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        variablesLabel = new javax.swing.JLabel();
        variablesList = new javax.swing.JComboBox<>();
        insertButton = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.PAGE_AXIS));

        jPanel1.setAlignmentX(0.0F);
        jPanel1.setLayout(new java.awt.GridBagLayout());

        org.openide.awt.Mnemonics.setLocalizedText(sortMatchesLabel, OStrings.getString("EXT_TMX_SORT_KEY")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel1.add(sortMatchesLabel, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        jPanel1.add(sortMatchesList, gridBagConstraints);

        org.openide.awt.Mnemonics.setLocalizedText(fuzzyThresholdLabel, OStrings.getString("EXT_TMX_FUZZY_THRESHOLD_KEY")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 0);
        jPanel1.add(fuzzyThresholdLabel, gridBagConstraints);

        fuzzyMatchThreshold.setModel(new javax.swing.SpinnerNumberModel(100, 0, 100, 5));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 0);
        jPanel1.add(fuzzyMatchThreshold, gridBagConstraints);

        add(jPanel1);
        add(filler2);

        jPanel7.setLayout(new javax.swing.BoxLayout(jPanel7, javax.swing.BoxLayout.Y_AXIS));

        org.openide.awt.Mnemonics.setLocalizedText(tagHandlingLabel, OStrings.getString("EXT_TMX_DESCRIPTION")); // NOI18N
        jPanel7.add(tagHandlingLabel);

        displayLevel2Tags.setSelected(true);
        org.openide.awt.Mnemonics.setLocalizedText(displayLevel2Tags, OStrings.getString("EXT_TMX_SHOW_LEVEL2")); // NOI18N
        jPanel7.add(displayLevel2Tags);

        useSlash.setSelected(true);
        org.openide.awt.Mnemonics.setLocalizedText(useSlash, OStrings.getString("EXT_TMX_USE_XML")); // NOI18N
        jPanel7.add(useSlash);

        add(jPanel7);
        add(filler3);

        jPanel5.setLayout(new javax.swing.BoxLayout(jPanel5, javax.swing.BoxLayout.Y_AXIS));

        keepForeignMatches.setSelected(true);
        org.openide.awt.Mnemonics.setLocalizedText(keepForeignMatches, OStrings.getString("EXT_TMX_KEEP_FOREIGN_MATCHES")); // NOI18N
        jPanel5.add(keepForeignMatches);

        foreignPenaltyPanel.setAlignmentX(0.0F);
        foreignPenaltyPanel.setLayout(new javax.swing.BoxLayout(foreignPenaltyPanel, javax.swing.BoxLayout.LINE_AXIS));

        org.openide.awt.Mnemonics.setLocalizedText(foreignPenaltyLabel, OStrings.getString("EXT_TMX_PENALTY_FOR_FOREIGN_MATCHES")); // NOI18N
        foreignPenaltyPanel.add(foreignPenaltyLabel);
        foreignPenaltyPanel.add(filler1);

        foreignPenaltySpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 5));
        foreignPenaltySpinner.setMaximumSize(new java.awt.Dimension(60, 32767));
        foreignPenaltyPanel.add(foreignPenaltySpinner);

        jPanel5.add(foreignPenaltyPanel);

        add(jPanel5);
        add(filler4);

        jPanel3.setAlignmentX(0.0F);
        jPanel3.setLayout(new java.awt.BorderLayout());

        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("org/omegat/Bundle"); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(templateLabel, bundle.getString("EXT_TMX_MATCHES_TEMPLATE")); // NOI18N
        jPanel3.add(templateLabel, java.awt.BorderLayout.NORTH);

        jScrollPane1.setMinimumSize(new java.awt.Dimension(525, 25));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(446, 96));

        matchesTemplate.setColumns(30);
        matchesTemplate.setRows(5);
        jScrollPane1.setViewportView(matchesTemplate);

        jPanel3.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel4.setLayout(new java.awt.BorderLayout());

        org.openide.awt.Mnemonics.setLocalizedText(variablesLabel, bundle.getString("EXT_TMX_MATCHES_TEMPLATE_VARIABLES")); // NOI18N
        jPanel4.add(variablesLabel, java.awt.BorderLayout.WEST);
        jPanel4.add(variablesList, java.awt.BorderLayout.CENTER);

        org.openide.awt.Mnemonics.setLocalizedText(insertButton, bundle.getString("BUTTON_INSERT")); // NOI18N
        jPanel4.add(insertButton, java.awt.BorderLayout.EAST);

        jPanel3.add(jPanel4, java.awt.BorderLayout.PAGE_END);

        add(jPanel3);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JCheckBox displayLevel2Tags;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.Box.Filler filler4;
    private javax.swing.JLabel foreignPenaltyLabel;
    javax.swing.JPanel foreignPenaltyPanel;
    javax.swing.JSpinner foreignPenaltySpinner;
    javax.swing.JSpinner fuzzyMatchThreshold;
    private javax.swing.JLabel fuzzyThresholdLabel;
    javax.swing.JButton insertButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    javax.swing.JCheckBox keepForeignMatches;
    javax.swing.JTextArea matchesTemplate;
    private javax.swing.JLabel sortMatchesLabel;
    javax.swing.JComboBox<SORT_KEY> sortMatchesList;
    private javax.swing.JLabel tagHandlingLabel;
    private javax.swing.JLabel templateLabel;
    javax.swing.JCheckBox useSlash;
    private javax.swing.JLabel variablesLabel;
    javax.swing.JComboBox<String> variablesList;
    // End of variables declaration//GEN-END:variables
}
