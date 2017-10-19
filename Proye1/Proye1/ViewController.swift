//
//  ViewController.swift
//  Proye1
//
//  Created by Diego Moreno Acevedo on 10/18/17.
//  Copyright © 2017 Diego Moreno Acevedo. All rights reserved.
//

import UIKit

class ViewController: UIViewController {
    @IBOutlet var web: UIWebView!

    override func viewDidLoad() {
        super.viewDidLoad()
        let url = URL(String: "http.youtube.com")!
        let request = URLRequest(url: url)
        // Do any additional setup after loading the view, typically from a nib.
    }

    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
        // Dispose of any resources that can be recreated.
    }


}

