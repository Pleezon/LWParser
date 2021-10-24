# LWParser
### a JSON parser for LogicWorld's game files (.logicworld)
Can save/load LogicWorld's game files to/from JSON
<Java 11>
Special thanks to Red_3D#3062 for the tips.



Sample output: 
```{
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
    "numberOfComponents": 28,
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
    "components": [
      {
        "componentAdress": {
          "adress": 10
        },
        "parentAdress": {
          "adress": 0
        },
        "componentID": 18,
        "localPosX": 0.14999998,
        "localPosY": 0.0,
        "localPosZ": 1.4462991,
        "rotationX": -0.0,
        "rotationY": 0.41310278,
        "rotationZ": -0.0,
        "rotationW": 0.91068447,
        "numberOfInputs": 0,
        "inputCircuitStateIDs": [],
        "numberOfOutputs": 0,
        "outputCircuitStateIDs": [],
        "amountOfCustomData": 11,
        "customData": [
          120,
          120,
          120,
          18,
          0,
          0,
          0,
          17,
          0,
          0,
          0
        ]
      },
      {
        "componentAdress": {
          "adress": 11
        },
        "parentAdress": {
          "adress": 10
        },
        "componentID": 20,
        "localPosX": 0.14999998,
        "localPosY": 0.14999981,
        "localPosZ": 0.14999975,
        "rotationX": 0.0,
        "rotationY": 0.7071068,
        "rotationZ": 0.0,
        "rotationW": -0.70710677,
        "numberOfInputs": 1,
        "inputCircuitStateIDs": [
          123
        ],
        "numberOfOutputs": 0,
        "outputCircuitStateIDs": [],
        "amountOfCustomData": 0,
        "customData": []
      },
      {
        "componentAdress": {
          "adress": 12
        },
        "parentAdress": {
          "adress": 10
        },
        "componentID": 20,
        "localPosX": 0.75,
        "localPosY": 0.14999981,
        "localPosZ": 0.14999978,
        "rotationX": 0.0,
        "rotationY": 0.7071068,
        "rotationZ": 0.0,
        "rotationW": -0.70710677,
        "numberOfInputs": 1,
        "inputCircuitStateIDs": [
          122
        ],
        "numberOfOutputs": 0,
        "outputCircuitStateIDs": [],
        "amountOfCustomData": 0,
        "customData": []
      },
      {
        "componentAdress": {
          "adress": 13
        },
        "parentAdress": {
          "adress": 10
        },
        "componentID": 20,
        "localPosX": 1.3499999,
        "localPosY": 0.14999981,
        "localPosZ": 0.14999977,
        "rotationX": 0.0,
        "rotationY": 0.7071068,
        "rotationZ": 0.0,
        "rotationW": -0.70710677,
        "numberOfInputs": 1,
        "inputCircuitStateIDs": [
          126
        ],
        "numberOfOutputs": 0,
        "outputCircuitStateIDs": [],
        "amountOfCustomData": 0,
        "customData": []
      },
      {
        "componentAdress": {
          "adress": 14
        },
        "parentAdress": {
          "adress": 10
        },
        "componentID": 20,
        "localPosX": 1.95,
        "localPosY": 0.14999981,
        "localPosZ": 0.14999987,
        "rotationX": 0.0,
        "rotationY": 0.7071068,
        "rotationZ": 0.0,
        "rotationW": -0.70710677,
        "numberOfInputs": 1,
        "inputCircuitStateIDs": [
          127
        ],
        "numberOfOutputs": 0,
        "outputCircuitStateIDs": [],
        "amountOfCustomData": 0,
        "customData": []
      },
      {
        "componentAdress": {
          "adress": 15
        },
        "parentAdress": {
          "adress": 10
        },
        "componentID": 20,
        "localPosX": 2.5500002,
        "localPosY": 0.14999981,
        "localPosZ": 0.14999974,
        "rotationX": 0.0,
        "rotationY": 0.7071068,
        "rotationZ": 0.0,
        "rotationW": -0.70710677,
        "numberOfInputs": 1,
        "inputCircuitStateIDs": [
          124
        ],
        "numberOfOutputs": 0,
        "outputCircuitStateIDs": [],
        "amountOfCustomData": 0,
        "customData": []
      },
      {
        "componentAdress": {
          "adress": 16
        },
        "parentAdress": {
          "adress": 10
        },
        "componentID": 20,
        "localPosX": 3.15,
        "localPosY": 0.14999981,
        "localPosZ": 0.14999966,
        "rotationX": 0.0,
        "rotationY": 0.7071068,
        "rotationZ": 0.0,
        "rotationW": -0.70710677,
        "numberOfInputs": 1,
        "inputCircuitStateIDs": [
          125
        ],
        "numberOfOutputs": 0,
        "outputCircuitStateIDs": [],
        "amountOfCustomData": 0,
        "customData": []
      },
      {
        "componentAdress": {
          "adress": 17
        },
        "parentAdress": {
          "adress": 10
        },
        "componentID": 20,
        "localPosX": 3.75,
        "localPosY": 0.14999981,
        "localPosZ": 0.14999978,
        "rotationX": 0.0,
        "rotationY": 0.7071068,
        "rotationZ": 0.0,
        "rotationW": -0.70710677,
        "numberOfInputs": 1,
        "inputCircuitStateIDs": [
          121
        ],
        "numberOfOutputs": 0,
        "outputCircuitStateIDs": [],
        "amountOfCustomData": 0,
        "customData": []
      },
      {
        "componentAdress": {
          "adress": 18
        },
        "parentAdress": {
          "adress": 10
        },
        "componentID": 6,
        "localPosX": 3.45,
        "localPosY": 0.14999981,
        "localPosZ": 0.44999978,
        "rotationX": 0.0,
        "rotationY": 0.7071068,
        "rotationZ": 0.0,
        "rotationW": -0.70710677,
        "numberOfInputs": 1,
        "inputCircuitStateIDs": [
          120
        ],
        "numberOfOutputs": 1,
        "outputCircuitStateIDs": [
          119
        ],
        "amountOfCustomData": 0,
        "customData": []
      },
      {
        "componentAdress": {
          "adress": 19
        },
        "parentAdress": {
          "adress": 10
        },
        "componentID": 6,
        "localPosX": 2.8500001,
        "localPosY": 0.14999981,
        "localPosZ": 0.44999966,
        "rotationX": 0.0,
        "rotationY": 0.7071068,
        "rotationZ": 0.0,
        "rotationW": -0.70710677,
        "numberOfInputs": 1,
        "inputCircuitStateIDs": [
          118
        ],
        "numberOfOutputs": 1,
        "outputCircuitStateIDs": [
          117
        ],
        "amountOfCustomData": 0,
        "customData": []
      },
      {
        "componentAdress": {
          "adress": 20
        },
        "parentAdress": {
          "adress": 10
        },
        "componentID": 6,
        "localPosX": 2.25,
        "localPosY": 0.14999981,
        "localPosZ": 0.4499998,
        "rotationX": 0.0,
        "rotationY": 0.7071068,
        "rotationZ": 0.0,
        "rotationW": -0.70710677,
        "numberOfInputs": 1,
        "inputCircuitStateIDs": [
          116
        ],
        "numberOfOutputs": 1,
        "outputCircuitStateIDs": [
          115
        ],
        "amountOfCustomData": 0,
        "customData": []
      },
      {
        "componentAdress": {
          "adress": 22
        },
        "parentAdress": {
          "adress": 10
        },
        "componentID": 6,
        "localPosX": 1.6500001,
        "localPosY": 0.14999981,
        "localPosZ": 0.44999987,
        "rotationX": 0.0,
        "rotationY": 0.7071068,
        "rotationZ": 0.0,
        "rotationW": -0.70710677,
        "numberOfInputs": 1,
        "inputCircuitStateIDs": [
          113
        ],
        "numberOfOutputs": 1,
        "outputCircuitStateIDs": [
          114
        ],
        "amountOfCustomData": 0,
        "customData": []
      },
      {
        "componentAdress": {
          "adress": 23
        },
        "parentAdress": {
          "adress": 10
        },
        "componentID": 6,
        "localPosX": 1.0500001,
        "localPosY": 0.14999981,
        "localPosZ": 0.44999975,
        "rotationX": 0.0,
        "rotationY": 0.7071068,
        "rotationZ": 0.0,
        "rotationW": -0.70710677,
        "numberOfInputs": 1,
        "inputCircuitStateIDs": [
          112
        ],
        "numberOfOutputs": 1,
        "outputCircuitStateIDs": [
          111
        ],
        "amountOfCustomData": 0,
        "customData": []
      },
      {
        "componentAdress": {
          "adress": 24
        },
        "parentAdress": {
          "adress": 10
        },
        "componentID": 6,
        "localPosX": 0.14999998,
        "localPosY": 0.14999981,
        "localPosZ": 0.44999987,
        "rotationX": 0.0,
        "rotationY": 0.7071068,
        "rotationZ": 0.0,
        "rotationW": -0.70710677,
        "numberOfInputs": 1,
        "inputCircuitStateIDs": [
          110
        ],
        "numberOfOutputs": 1,
        "outputCircuitStateIDs": [
          109
        ],
        "amountOfCustomData": 0,
        "customData": []
      },
      {
        "componentAdress": {
          "adress": 25
        },
        "parentAdress": {
          "adress": 10
        },
        "componentID": 14,
        "localPosX": 0.14999998,
        "localPosY": 0.14999981,
        "localPosZ": 0.14999981,
        "rotationX": 0.0,
        "rotationY": 0.7071068,
        "rotationZ": 0.0,
        "rotationW": -0.70710677,
        "numberOfInputs": 1,
        "inputCircuitStateIDs": [
          108
        ],
        "numberOfOutputs": 0,
        "outputCircuitStateIDs": [],
        "amountOfCustomData": 4,
        "customData": [
          0,
          0,
          0,
          0
        ]
      },
      {
        "componentAdress": {
          "adress": 26
        },
        "parentAdress": {
          "adress": 10
        },
        "componentID": 14,
        "localPosX": 1.0500001,
        "localPosY": 0.14999981,
        "localPosZ": 0.1499998,
        "rotationX": 0.0,
        "rotationY": 0.7071068,
        "rotationZ": 0.0,
        "rotationW": -0.70710677,
        "numberOfInputs": 1,
        "inputCircuitStateIDs": [
          107
        ],
        "numberOfOutputs": 0,
        "outputCircuitStateIDs": [],
        "amountOfCustomData": 4,
        "customData": [
          0,
          0,
          0,
          0
        ]
      },
      {
        "componentAdress": {
          "adress": 27
        },
        "parentAdress": {
          "adress": 10
        },
        "componentID": 14,
        "localPosX": 1.6500002,
        "localPosY": 0.14999981,
        "localPosZ": 0.14999983,
        "rotationX": 0.0,
        "rotationY": 0.7071068,
        "rotationZ": 0.0,
        "rotationW": -0.70710677,
        "numberOfInputs": 1,
        "inputCircuitStateIDs": [
          106
        ],
        "numberOfOutputs": 0,
        "outputCircuitStateIDs": [],
        "amountOfCustomData": 4,
        "customData": [
          0,
          0,
          0,
          0
        ]
      },
      {
        "componentAdress": {
          "adress": 28
        },
        "parentAdress": {
          "adress": 10
        },
        "componentID": 14,
        "localPosX": 2.2499998,
        "localPosY": 0.14999981,
        "localPosZ": 0.14999966,
        "rotationX": 0.0,
        "rotationY": 0.7071068,
        "rotationZ": 0.0,
        "rotationW": -0.70710677,
        "numberOfInputs": 1,
        "inputCircuitStateIDs": [
          105
        ],
        "numberOfOutputs": 0,
        "outputCircuitStateIDs": [],
        "amountOfCustomData": 4,
        "customData": [
          0,
          0,
          0,
          0
        ]
      },
      {
        "componentAdress": {
          "adress": 29
        },
        "parentAdress": {
          "adress": 10
        },
        "componentID": 14,
        "localPosX": 2.8500004,
        "localPosY": 0.14999981,
        "localPosZ": 0.14999972,
        "rotationX": 0.0,
        "rotationY": 0.7071068,
        "rotationZ": 0.0,
        "rotationW": -0.70710677,
        "numberOfInputs": 1,
        "inputCircuitStateIDs": [
          104
        ],
        "numberOfOutputs": 0,
        "outputCircuitStateIDs": [],
        "amountOfCustomData": 4,
        "customData": [
          0,
          0,
          0,
          0
        ]
      },
      {
        "componentAdress": {
          "adress": 30
        },
        "parentAdress": {
          "adress": 10
        },
        "componentID": 14,
        "localPosX": 3.4499998,
        "localPosY": 0.14999981,
        "localPosZ": 0.1499998,
        "rotationX": 0.0,
        "rotationY": 0.7071068,
        "rotationZ": 0.0,
        "rotationW": -0.70710677,
        "numberOfInputs": 1,
        "inputCircuitStateIDs": [
          103
        ],
        "numberOfOutputs": 0,
        "outputCircuitStateIDs": [],
        "amountOfCustomData": 4,
        "customData": [
          0,
          0,
          0,
          0
        ]
      },
      {
        "componentAdress": {
          "adress": 31
        },
        "parentAdress": {
          "adress": 10
        },
        "componentID": 14,
        "localPosX": 4.05,
        "localPosY": 0.14999981,
        "localPosZ": 0.1499996,
        "rotationX": 0.0,
        "rotationY": 0.7071068,
        "rotationZ": 0.0,
        "rotationW": -0.70710677,
        "numberOfInputs": 1,
        "inputCircuitStateIDs": [
          102
        ],
        "numberOfOutputs": 0,
        "outputCircuitStateIDs": [],
        "amountOfCustomData": 4,
        "customData": [
          0,
          0,
          0,
          0
        ]
      },
      {
        "componentAdress": {
          "adress": 32
        },
        "parentAdress": {
          "adress": 10
        },
        "componentID": 14,
        "localPosX": 4.65,
        "localPosY": 0.14999981,
        "localPosZ": 0.14999953,
        "rotationX": 0.0,
        "rotationY": 0.7071068,
        "rotationZ": 0.0,
        "rotationW": -0.70710677,
        "numberOfInputs": 1,
        "inputCircuitStateIDs": [
          101
        ],
        "numberOfOutputs": 0,
        "outputCircuitStateIDs": [],
        "amountOfCustomData": 4,
        "customData": [
          0,
          0,
          0,
          0
        ]
      },
      {
        "componentAdress": {
          "adress": 33
        },
        "parentAdress": {
          "adress": 10
        },
        "componentID": 14,
        "localPosX": 5.25,
        "localPosY": 0.14999981,
        "localPosZ": 0.15000014,
        "rotationX": 0.0,
        "rotationY": 0.7071068,
        "rotationZ": 0.0,
        "rotationW": -0.70710677,
        "numberOfInputs": 1,
        "inputCircuitStateIDs": [
          100
        ],
        "numberOfOutputs": 0,
        "outputCircuitStateIDs": [],
        "amountOfCustomData": 4,
        "customData": [
          0,
          0,
          0,
          0
        ]
      },
      {
        "componentAdress": {
          "adress": 34
        },
        "parentAdress": {
          "adress": 10
        },
        "componentID": 20,
        "localPosX": 4.9500003,
        "localPosY": 0.14999981,
        "localPosZ": 0.14999984,
        "rotationX": 0.0,
        "rotationY": 0.7071068,
        "rotationZ": 0.0,
        "rotationW": -0.70710677,
        "numberOfInputs": 1,
        "inputCircuitStateIDs": [
          99
        ],
        "numberOfOutputs": 0,
        "outputCircuitStateIDs": [],
        "amountOfCustomData": 0,
        "customData": []
      },
      {
        "componentAdress": {
          "adress": 35
        },
        "parentAdress": {
          "adress": 10
        },
        "componentID": 20,
        "localPosX": 4.3500004,
        "localPosY": 0.14999981,
        "localPosZ": 0.1499999,
        "rotationX": 0.0,
        "rotationY": 0.7071068,
        "rotationZ": 0.0,
        "rotationW": -0.70710677,
        "numberOfInputs": 1,
        "inputCircuitStateIDs": [
          98
        ],
        "numberOfOutputs": 0,
        "outputCircuitStateIDs": [],
        "amountOfCustomData": 0,
        "customData": []
      },
      {
        "componentAdress": {
          "adress": 36
        },
        "parentAdress": {
          "adress": 10
        },
        "componentID": 6,
        "localPosX": 4.05,
        "localPosY": 0.14999981,
        "localPosZ": 0.44999972,
        "rotationX": 0.0,
        "rotationY": 0.7071068,
        "rotationZ": 0.0,
        "rotationW": -0.70710677,
        "numberOfInputs": 1,
        "inputCircuitStateIDs": [
          97
        ],
        "numberOfOutputs": 1,
        "outputCircuitStateIDs": [
          96
        ],
        "amountOfCustomData": 0,
        "customData": []
      },
      {
        "componentAdress": {
          "adress": 37
        },
        "parentAdress": {
          "adress": 10
        },
        "componentID": 6,
        "localPosX": 4.65,
        "localPosY": 0.14999981,
        "localPosZ": 0.44999966,
        "rotationX": 0.0,
        "rotationY": 0.7071068,
        "rotationZ": 0.0,
        "rotationW": -0.70710677,
        "numberOfInputs": 1,
        "inputCircuitStateIDs": [
          95
        ],
        "numberOfOutputs": 1,
        "outputCircuitStateIDs": [
          94
        ],
        "amountOfCustomData": 0,
        "customData": []
      },
      {
        "componentAdress": {
          "adress": 38
        },
        "parentAdress": {
          "adress": 10
        },
        "componentID": 6,
        "localPosX": 5.25,
        "localPosY": 0.14999981,
        "localPosZ": 0.44999978,
        "rotationX": 0.0,
        "rotationY": 0.7071068,
        "rotationZ": 0.0,
        "rotationW": -0.70710677,
        "numberOfInputs": 1,
        "inputCircuitStateIDs": [
          93
        ],
        "numberOfOutputs": 1,
        "outputCircuitStateIDs": [
          92
        ],
        "amountOfCustomData": 0,
        "customData": []
      }
    ]
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
      -84,
      0
    ]
  },
  "footer": {
    "footer": "redstone sux lol"
  }
}
