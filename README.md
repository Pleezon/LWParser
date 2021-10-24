# LWParser
### a JSON parser for LogicWorld's game files (.logicworld)
Can save/load LogicWorld's game files to/from JSON
<Java 11>
Special thanks to Red_3D#3062 for the tips.



Sample output: 
``` 
{
  "header": {
    "header": "Logic World save"
  },
  "saveFormatVersion": {
    "saveFormatVersion": 5
  },
  "gameVersion": {
    "version": "0.90.0.7602"
  },
  "saveType": {
    "type": 1
  },
  "numberOfComponentsAndWires": {
    "numberOfComponents": 0,
    "numberOfWires": 0
  },
  "modVersions": {
    "numberOfModVersions": 0,
    "modVersions": []
  },
  "componentIDsMap": {
    "mapping": [
      {
        "componentID": 0,
        "textID": "MHG.Switch"
      },
      {
        "componentID": 1,
        "textID": "MHG.PanelSwitch"
      },
      {
        "componentID": 2,
        "textID": "MHG.Button"
      },
      {
        "componentID": 3,
        "textID": "MHG.PanelButton"
      },
      {
        "componentID": 4,
        "textID": "MHG.Key"
      },
      {
        "componentID": 5,
        "textID": "MHG.PanelKey"
      },
      {
        "componentID": 6,
        "textID": "MHG.Inverter"
      },
      {
        "componentID": 7,
        "textID": "MHG.XorGate"
      },
      {
        "componentID": 8,
        "textID": "MHG.AndGate"
      },
      {
        "componentID": 9,
        "textID": "MHG.Delayer"
      },
      {
        "componentID": 10,
        "textID": "MHG.DLatch"
      },
      {
        "componentID": 11,
        "textID": "MHG.Randomizer"
      },
      {
        "componentID": 12,
        "textID": "MHG.Relay"
      },
      {
        "componentID": 13,
        "textID": "MHG.Buffer"
      },
      {
        "componentID": 14,
        "textID": "MHG.StandingDisplay"
      },
      {
        "componentID": 15,
        "textID": "MHG.PanelDisplay"
      },
      {
        "componentID": 16,
        "textID": "MHG.Singer"
      },
      {
        "componentID": 17,
        "textID": "MHG.Drum"
      },
      {
        "componentID": 18,
        "textID": "MHG.CircuitBoard"
      },
      {
        "componentID": 19,
        "textID": "MHG.Mount"
      },
      {
        "componentID": 20,
        "textID": "MHG.Peg"
      },
      {
        "componentID": 21,
        "textID": "MHG.ThroughPeg"
      },
      {
        "componentID": 22,
        "textID": "MHG.Socket"
      },
      {
        "componentID": 23,
        "textID": "MHG.ThroughSocket"
      },
      {
        "componentID": 24,
        "textID": "MHG.ChubbySocket"
      },
      {
        "componentID": 25,
        "textID": "MHG.ChubbyThroughSocket"
      },
      {
        "componentID": 26,
        "textID": "MHG.Label"
      },
      {
        "componentID": 27,
        "textID": "MHG.PanelLabel"
      },
      {
        "componentID": 28,
        "textID": "MHG.Chair"
      },
      {
        "componentID": 29,
        "textID": "MHG.Flag"
      }
    ],
    "numberOfComponentIDs": 30
  },
  "componentsData": {
    "components": []
  },
  "wiresData": {
    "wires": []
  },
  "circuitStates": {
    "amountOfBytes": 16,
    "circuitStates": [
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      0,
      80,
      1,
      -96,
      -86,
      0
    ]
  },
  "footer": {
    "footer": "redstone sux lol"
  }
}
