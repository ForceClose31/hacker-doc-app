package com.example.task_beginner_dicoding

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.task_beginner_dicoding.adapters.HackerAdapter
import com.example.task_beginner_dicoding.models.Hacker

class MainActivity : AppCompatActivity() {

    private lateinit var hackerRecyclerView: RecyclerView
    private lateinit var hackerList: ArrayList<Hacker>
    private lateinit var hackerAdapter: HackerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        hackerRecyclerView = findViewById(R.id.hackerRecyclerView)
        hackerList = ArrayList()

        hackerList.add(
            Hacker(
                "Kevin Mitnick",
                "Famous for hacking into 40 major corporations",
                R.drawable.kevin_mitnick,
                "Kevin Mitnick is widely regarded as one of the most famous hackers in history, but his legacy extends far beyond his criminal past. After serving time for his hacking activities, Mitnick transformed himself into an ethical hacker and cybersecurity expert. He founded Mitnick Security Consulting, where he provided expert advice on penetration testing and vulnerability assessments to corporations and governments worldwide. Mitnick also became a best-selling author, penning books such as \"The Art of Deception\" and \"Ghost in the Wires\", which educated readers about social engineering and hacking techniques. As a highly sought-after speaker, he delivered keynote speeches at major cybersecurity events, sharing his knowledge to help improve global security practices.",
                "Born in 1963, Kevin Mitnick grew up in Los Angeles and began hacking as a teenager, initially engaging in minor exploits like free bus rides through social engineering. His skills quickly advanced, leading him to hack into major corporations such as IBM and Motorola. By the 1990s, he became a fugitive on the FBI's most wanted list, evading capture for years due to his advanced techniques in both hacking and social engineering. After his arrest in 1995 and subsequent imprisonment, Mitnick emerged as a reformed figure. He dedicated his life to ethical hacking, building a successful career in cybersecurity, writing books, and helping organizations protect themselves against the very vulnerabilities he once exploited.",
                listOf(R.drawable.kevin_image1, R.drawable.kevin_image2, R.drawable.kevin_image3)
            )
        )
        hackerList.add(
            Hacker(
                "Anonymous",
                "A group known for its hacktivism",
                R.drawable.anonymous,
                "Anonymous is a decentralized collective of hackers and activists, often referred to as \"hacktivists,\" who have been responsible for numerous high-profile cyber-attacks and digital protests since the mid-2000s. The group's achievements range from exposing corruption and oppressive regimes to advocating for free speech and internet freedom. Some of their notable actions include launching Operation Payback in defense of WikiLeaks by targeting companies like PayPal and MasterCard, which had stopped processing donations to the organization. They were also involved in Operation Tunisia and Operation Egypt, where they helped citizens bypass government censorship during the Arab Spring. Anonymous is known for its use of DDoS (Distributed Denial of Service) attacks, leaking sensitive data, and publicly embarrassing governments and corporations they believe to be unjust.",
                "Anonymous first gained prominence in 2008 with a series of attacks against the Church of Scientology, known as Project Chanology, which protested the Church's attempts to censor the internet. The group’s origins lie in the online community 4chan, where anonymous users banded together under a common identity. Over the years, Anonymous has evolved into a global movement without a central leadership structure. Members operate under the famous \"Guy Fawkes\" mask symbol, inspired by the film V for Vendetta. Their targets are often organizations or governments they deem as oppressive, corrupt, or violating freedom of speech and human rights. Anonymous operates under the slogan \"We are Anonymous. We are Legion. We do not forgive. We do not forget. Expect us,\" and they often use social media platforms to coordinate cyber-attacks and raise awareness about political causes. Despite being a decentralized and loosely connected network, their ability to mobilize members for collective action has made them a powerful force in modern activism and digital warfare.",
                listOf(R.drawable.anonymous1, R.drawable.anonymous2, R.drawable.anonymous3)
            )
        )
        hackerList.add(
            Hacker(
                "Adrian Lamo",
                "Best known for hacking into major organizations",
                R.drawable.adrian_lamo,
                "Adrian Lamo was a prominent hacker, best known for his high-profile breaches of companies such as Microsoft, Yahoo!, and The New York Times in the early 2000s. His hacking exploits earned him the nickname \"The Homeless Hacker\" because he often used internet cafes and libraries to carry out his attacks. Lamo’s most significant achievement was his infiltration of The New York Times' internal network, where he gained access to sensitive information and even added himself to their expert sources database. Despite his illegal activities, Lamo was known for not profiting from his hacks but rather exposing vulnerabilities in systems and reporting them to companies. However, his most controversial act came in 2010 when he reported U.S. Army intelligence analyst Chelsea Manning to authorities after she leaked classified documents to WikiLeaks, which made global headlines.",
                "Born on February 20, 1981, Adrian Lamo grew up in Boston, Massachusetts, and displayed an early talent for computers. In the early 2000s, he gained notoriety for hacking into major corporations, often exposing security flaws rather than causing harm. Lamo was eventually arrested in 2003 for hacking The New York Times and sentenced to six months of home detention, followed by two years of probation. His decision to turn in Chelsea Manning to U.S. authorities, after she confided in him about leaking classified military and diplomatic documents, deeply divided the hacking community. Some viewed him as a traitor, while others saw his actions as a moral choice. Lamo lived a relatively quiet life after the Manning incident, though he remained a controversial figure in hacker culture until his death on March 14, 2018. His legacy is marked by his early hacking exploits and his pivotal role in one of the most significant leaks in modern history.",
                listOf(R.drawable.adrian_lamo1, R.drawable.adrian_lamo2, R.drawable.adrian_lamo3)
            )
        )
        hackerList.add(
            Hacker(
                "Gary McKinnon",
                "Known for hacking NASA systems",
                R.drawable.gary_mckinnon,
                "Gary McKinnon is a British hacker best known for his infiltration of U.S. military and NASA computer systems between 2001 and 2002. His hacking exploits led to what is often referred to as the \"biggest military computer hack of all time.\" McKinnon claimed to have accessed over 90 computers, where he sought to find evidence of UFOs, suppressed technologies, and government cover-ups regarding extraterrestrial life. He was particularly noted for his ability to exploit security vulnerabilities, such as weak passwords, allowing him to remain undetected for an extended period. McKinnon's activities sparked significant international attention, leading to a lengthy legal battle over his extradition to the U.S., where he faced charges that could have resulted in substantial prison time. His case raised awareness about cybersecurity vulnerabilities and the potential consequences of unauthorized access to military networks.",
                "Born on February 8, 1966, in London, England, Gary McKinnon developed an early interest in computers and technology. He began hacking as a teenager and eventually focused on large-scale systems, drawn to the idea of uncovering hidden information. In 2001, following the September 11 attacks, McKinnon accessed U.S. military networks under the belief that he could find evidence of government secrets related to UFOs and advanced technologies. His hacking activities went unnoticed for a considerable time, but when they were finally discovered, they led to a significant investigation by the U.S. government. In 2005, the U.S. issued an extradition request for McKinnon, which ignited a lengthy legal process that garnered media attention and public support, as many viewed him as a harmless hacker with a genuine interest in uncovering truths. After years of legal battles, McKinnon was ultimately spared extradition in 2012 due to his health issues, including severe depression and Asperger syndrome. He has since lived a relatively private life, continuing to advocate for issues related to cybersecurity and mental health.",
                listOf(R.drawable.gary_mckinnon1, R.drawable.gary_mckinnon2, R.drawable.gary_mckinnon3)
            )
        )
        hackerList.add(
            Hacker(
                "Albert Gonzalez",
                "Responsible for one of the largest credit card thefts",
                R.drawable.albert_gonzalez,
                "Albert Gonzalez is a notorious hacker and cybercriminal best known for his role in one of the largest credit card thefts in history. Between 2005 and 2007, he led a group that stole over 40 million credit card numbers from major retailers, including TJX Companies and Heartland Payment Systems. Gonzalez utilized sophisticated techniques, including SQL injection and packet sniffing, to exploit security vulnerabilities in the companies’ networks. His hacking activities were highly organized, and he often sold the stolen credit card information on underground forums, earning millions of dollars. In 2009, he was arrested and later pleaded guilty to multiple charges, including conspiracy, identity theft, and wire fraud, which led to a significant prison sentence.",
                "Born on March 22, 1981, in Miami, Florida, Albert Gonzalez was introduced to computers at a young age, quickly developing a talent for programming and hacking. In his teenage years, he became involved in various online forums, where he connected with other hackers and began engaging in cybercrime. By the mid-2000s, Gonzalez had formed a group of hackers and started executing large-scale attacks on various retailers and financial institutions. His criminal activities caught the attention of federal law enforcement, and after an extensive investigation, he was arrested in 2008. Following his arrest, Gonzalez cooperated with authorities, providing insights into the hacking community and the methods he used for cyber theft. In 2010, he was sentenced to 20 years in prison, marking one of the longest sentences for a cybercriminal at that time. Gonzalez’s case highlights the growing threat of cybercrime and the vulnerabilities within the retail and payment processing industries, prompting increased efforts toward cybersecurity.",
                listOf(R.drawable.albert_gonzalez1, R.drawable.albert_gonzalez2, R.drawable.albert_gonzalez3)
            )
        )
        hackerList.add(
            Hacker(
                "Jonathan James",
                "First juvenile hacker to be imprisoned in the US",
                R.drawable.jonathan_james,
                "Jonathan James was a pioneering hacker known for being the first juvenile to be incarcerated for cybercrime in the United States. In 1999, at the age of 15, he gained unauthorized access to several computer systems, including those of the U.S. Department of Defense and NASA. During his hacking spree, James accessed sensitive information, including usernames and passwords, and downloaded proprietary software worth approximately \$1.7 million. His ability to exploit vulnerabilities and evade detection garnered significant attention from law enforcement agencies. In 2000, after a thorough investigation, he was arrested and charged with various offenses, ultimately leading to his conviction. James's case highlighted the vulnerabilities in government and corporate systems and sparked discussions about the need for enhanced cybersecurity measures.",
                "Born on December 12, 1983, in Florida, Jonathan James exhibited a strong interest in computers and technology from a young age. He taught himself programming and began hacking as a teenager, quickly gaining a reputation in online hacking communities. His most notable exploit was breaching the Department of Defense’s systems, where he remained undetected for months, accessing sensitive files. After his arrest in 2000, he was sentenced to six months of house arrest and probation, as well as required to complete community service. Following his release, James struggled to reintegrate into society due to the stigma attached to his criminal record. Tragically, he died by suicide on May 18, 2008, at the age of 24, leading to discussions about the pressures faced by young hackers and the need for mental health support within the tech community. Jonathan James's story remains a cautionary tale about the potential consequences of cybercrime and the importance of addressing the psychological challenges faced by individuals involved in hacking.",
                listOf(R.drawable.jonathan_james1, R.drawable.jonathan_james2, R.drawable.jonathan_james3)
            )
        )
        hackerList.add(
            Hacker(
                "Matthew Bevan",
                "Hacked into military computers",
                R.drawable.matthew_bevan,
                "Matthew Bevan is a British hacker known for his exploits in the mid-1990s, particularly for breaching U.S. military and government systems. Alongside his hacking partner, Bevan accessed sensitive computer networks, including those of the U.S. Air Force, and downloaded classified documents. One of his most notable achievements was infiltrating the U.S. Army's systems, which he reportedly did to gather information on the military's involvement in conflicts around the world. His activities caught the attention of law enforcement agencies, and he became one of the first hackers to face extradition to the United States for cybercrimes. Although he was arrested in 1996, he was ultimately not extradited, highlighting the complexities and legal challenges involved in prosecuting hackers across international borders.",
                "Born in 1975 in South Wales, Matthew Bevan developed an interest in computers and technology at a young age. As a teenager, he became involved in hacking, inspired by the early hacker culture of the 1990s. Bevan and his partner gained notoriety for their sophisticated hacking methods, which included exploiting vulnerabilities in military systems. His arrest in 1996 led to significant media coverage, as it was one of the early cases of a hacker facing potential extradition to the U.S. for cybercrimes. Following his arrest, Bevan cooperated with authorities, providing information about his activities. After his legal troubles, he moved away from hacking and pursued a career in information technology. Bevan’s case remains notable in the history of cybersecurity, emphasizing the need for robust defenses against cyber intrusions and the evolving nature of international cybercrime.",
                listOf(R.drawable.matthew_bevan1, R.drawable.matthew_bevan2)
            )
        )
        hackerList.add(
            Hacker(
                "LulzSec",
                "A group known for high-profile cyberattacks",
                R.drawable.lulzsec,
                "LulzSec, short for \"Lulz Security,\" was a notorious hacking group that emerged in 2011, gaining fame for its high-profile cyber-attacks and data breaches. The collective was known for its playful yet defiant attitude towards authority and often operated with the motto “For the lulz,” indicating their intention to entertain themselves and the public rather than for profit. Among their most significant achievements was the attack on Sony Pictures, where they stole and leaked personal information about thousands of employees. They also targeted major corporations and government entities, including CIA, Fox, and PBS, and their attacks often involved DDoS (Distributed Denial of Service) tactics, website defacements, and the release of sensitive data. LulzSec's activities contributed to a wider discussion about cybersecurity vulnerabilities and the ethical implications of hacktivism.",
                "LulzSec was formed as an offshoot of the larger hacker collective Anonymous in May 2011. The group consisted of a small number of highly skilled hackers, some of whom later identified themselves publicly. Their first major operation was a successful DDoS attack against the PBS website, which they executed to protest the portrayal of WikiLeaks founder Julian Assange. LulzSec's approach combined humor and technical prowess, which endeared them to many within the hacker community. However, their actions also drew the attention of law enforcement agencies worldwide. After a 50-day hacking spree, the group announced its dissolution in June 2011, claiming that they had accomplished their goals. Despite their relatively short existence, LulzSec left a lasting impact on the landscape of hacktivism and cybersecurity, with many of their members later facing legal repercussions for their actions. The group's legacy continues to influence discussions around the ethics of hacking and the balance between activism and legality.",
                listOf(R.drawable.lulzsec1, R.drawable.lulzsec2, R.drawable.lulzsec3)
            )
        )
        hackerList.add(
            Hacker(
                "Guccifer 2.0",
                "Known for leaking political documents",
                R.drawable.guccifer,
                "Guccifer 2.0 is the pseudonym used by an individual or group of hackers who claimed responsibility for a series of cyber-attacks targeting the Democratic National Committee (DNC) and other political organizations during the 2016 U.S. presidential election. Guccifer 2.0 gained notoriety for leaking thousands of emails and documents that revealed sensitive information about the DNC, party officials, and the campaign of then-presidential candidate Hillary Clinton. Their activities contributed to widespread controversy and debate surrounding election integrity, cyber warfare, and foreign interference in U.S. elections. Guccifer 2.0's leaks were strategically timed to coincide with major events during the campaign, amplifying their impact on public opinion and the political landscape.",
                "The identity of Guccifer 2.0 has been widely debated, with many experts believing that the persona was part of a broader Russian hacking operation aimed at undermining U.S. democracy. The name is a nod to the infamous Romanian hacker Guccifer, who gained fame for breaching the accounts of high-profile figures, including former President George W. Bush’s family. Guccifer 2.0 surfaced in June 2016, shortly after the DNC announced that it had been hacked. The individual or group behind the name communicated with media outlets, claiming to be a lone hacker and denying any ties to the Russian government. However, investigations by U.S. intelligence agencies later linked Guccifer 2.0 to Russian military intelligence (GRU). In January 2017, the U.S. Intelligence Community formally attributed the DNC hacks to Russian actors, and Guccifer 2.0 became a central figure in discussions about cyber espionage and its implications for national security. The actions attributed to Guccifer 2.0 raised critical questions about the role of hacking in political processes and the vulnerabilities of modern democratic systems.",
                listOf(R.drawable.guccifer1, R.drawable.guccifer2, R.drawable.guccifer3)
            )
        )
        hackerList.add(
            Hacker(
                "Tsutomu Shimomura",
                "Helped capture Kevin Mitnick",
                R.drawable.tsutomu_shimomura,
                "Tsutomu Shimomura is a renowned computer security expert and hacker best known for his role in tracking down the infamous hacker Kevin Mitnick in the mid-1990s. Shimomura's expertise in cybersecurity and his technical skills enabled him to play a pivotal role in the investigation that led to Mitnick’s arrest. He developed tools and techniques that helped authorities understand Mitnick's methods and pinpoint his location. Shimomura's collaboration with the FBI during this high-profile case not only contributed to the capture of one of the most wanted hackers at the time but also highlighted the importance of cybersecurity measures and the vulnerabilities present in computer systems. His work raised awareness about the need for robust defenses against cyber threats and the implications of hacking on national security.",
                "Born on July 22, 1970, in Japan, Tsutomu Shimomura moved to the United States at a young age and developed a keen interest in computers and technology. He attended San Diego State University, where he earned a degree in physics and later pursued a career in computer science and cybersecurity. In the early 1990s, Shimomura became a respected figure in the tech community, working as a researcher and contributing to various cybersecurity projects. His prominence grew significantly when Kevin Mitnick began his hacking spree, culminating in a series of intrusions into various government and corporate networks. After Mitnick's arrest in 1995, Shimomura wrote the book \"Takedown: The Pursuit and Capture of Kevin Mitnick, America's Most Wanted Computer Outlaw,\" detailing the events surrounding the investigation and capture. The book was later adapted into a film, further cementing Shimomura's status in the cybersecurity field. Today, he continues to be an influential voice in discussions about cybersecurity, hacking, and technology, advocating for improved security practices and awareness in an increasingly digital world.",
                listOf(R.drawable.tsutomu_shimomura1, R.drawable.tsutomu_shimomura2, R.drawable.tsutomu_shimomura3) 
            )
        )

        hackerAdapter = HackerAdapter(hackerList, this) { selectedHacker ->
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("hacker", selectedHacker)
            startActivity(intent)
        }

        hackerRecyclerView.layoutManager = LinearLayoutManager(this)
        hackerRecyclerView.adapter = hackerAdapter

        findViewById<ImageView>(R.id.aboutIcon).setOnClickListener {
            val intent = Intent(this, AboutActivity::class.java)
            startActivity(intent)
        }
    }
}
